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
  private int boidGroup;
  
  public BoidBody(final UUID id, final Shape2f<?> shape, final float maxLinearSpeed, final float maxLinearAcceleration, final float maxAngularSpeed, final float maxAngularAcceleration, final Frustum frustum) {
    super(id, shape, maxLinearSpeed, maxLinearAcceleration, maxAngularSpeed, maxAngularAcceleration, frustum);
  }
  
  @Pure
  public int getGroup() {
    return this.boidGroup;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean."
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
  
  @Override
  @Pure
  @SyntheticMember
  public BoidBody clone() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe return type is incompatible with equals(Object). Current method has the return type: void. The super method has the return type: boolean.");
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 2905868767L;
}
