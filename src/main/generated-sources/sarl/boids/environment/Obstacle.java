package boids.environment;

import framework.environment.AbstractSituatedObject;
import framework.math.Point2f;
import framework.math.Shape2f;
import io.sarl.lang.annotation.DefaultValue;
import io.sarl.lang.annotation.DefaultValueSource;
import io.sarl.lang.annotation.DefaultValueUse;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.6")
@SarlElementType(9)
@SuppressWarnings("all")
public class Obstacle extends AbstractSituatedObject {
  @Override
  @Pure
  @SyntheticMember
  public Obstacle clone() {
    try {
      return (Obstacle) super.clone();
    } catch (Throwable exception) {
      throw new Error(exception);
    }
  }
  
  /**
   * @optionalparam id the identifier of the object.
   * @optionalparam shape the shape of the body, considering that it is centered at the (0,0) position.
   * @optionalparam position is the position of the object.
   */
  @SyntheticMember
  @DefaultValueUse("java.util.UUID,framework.math.Shape2f<?>,framework.math.Point2f")
  public Obstacle(final UUID id, final Shape2f<?> shape) {
    super(id, shape);
  }
  
  /**
   * @param id the identifier of the object.
   * @param shape the shape of the body, considering that it is centered at the (0,0) position.
   * @param position is the position of the object.
   */
  @SyntheticMember
  @DefaultValueSource
  public Obstacle(final UUID id, final Shape2f<?> shape, @DefaultValue("framework.environment.AbstractSituatedObject#NEW_0") final Point2f position) {
    super(id, shape, position);
  }
  
  /**
   * @param id the identifier of the object.
   * @param shape the shape of the body, considering that it is centered at the (0,0) position.
   * @param x is the position of the object.
   * @param y is the position of the object.
   */
  @SyntheticMember
  public Obstacle(final UUID id, final Shape2f<?> shape, final float x, final float y) {
    super(id, shape, x, y);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 1L;
}
