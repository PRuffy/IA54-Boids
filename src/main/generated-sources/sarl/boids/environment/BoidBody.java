package boids.environment;

import framework.environment.AgentBody;
import framework.environment.Frustum;
import framework.math.Shape2f;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.6")
@SarlElementType(9)
@SuppressWarnings("all")
public class BoidBody extends AgentBody {
  /**
   * Variables définit dans les superclasses
   *  frustum
   *  maxLinearspeed
   *  maxlinearAcceleration
   *  maxangularSpeed
   *  maxangularAcceleration
   *  angle
   *  MotionInfluence
   *  OtherInfluence
   *  perceptions
   *  currentAngularspeed
   *  linearMove
   *  id
   *  position
   *  shape
   *  name
   *  type(Serializable)
   */
  public BoidBody(final UUID id, final Shape2f<?> shape, final float maxLinearSpeed, final float maxLinearAcceleration, final float maxAngularSpeed, final float maxAngularAcceleration, final Frustum frustum) {
    super(id, shape, maxLinearSpeed, maxLinearAcceleration, maxAngularSpeed, maxAngularAcceleration, frustum);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public BoidBody clone() {
    try {
      return (BoidBody) super.clone();
    } catch (Throwable exception) {
      throw new Error(exception);
    }
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 1675068396L;
}
