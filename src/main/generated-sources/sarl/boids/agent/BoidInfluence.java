package boids.agent;

import framework.environment.MotionInfluence;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.6")
@SarlElementType(14)
@SuppressWarnings("all")
public class BoidInfluence extends Event {
  public final MotionInfluence motionInfluence;
  
  public BoidInfluence(final MotionInfluence influence) {
    this.motionInfluence = influence;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  /**
   * Returns a String representation of the BoidInfluence event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected String attributesToString() {
    StringBuilder result = new StringBuilder(super.attributesToString());
    result.append("motionInfluence  = ").append(this.motionInfluence);
    return result.toString();
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -2846236412L;
}
