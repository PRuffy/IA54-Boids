package boids.agent;

import framework.environment.SituatedObject;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.6")
@SarlElementType(14)
@SuppressWarnings("all")
public class Perception extends Event {
  public final List<SituatedObject> list;
  
  public final UUID bodyID;
  
  public Perception(final List<SituatedObject> perception, final UUID id) {
    this.list = perception;
    this.bodyID = id;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Perception other = (Perception) obj;
    if (!Objects.equals(this.bodyID, other.bodyID)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.bodyID);
    return result;
  }
  
  /**
   * Returns a String representation of the Perception event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected String attributesToString() {
    StringBuilder result = new StringBuilder(super.attributesToString());
    result.append("list  = ").append(this.list);
    result.append("bodyID  = ").append(this.bodyID);
    return result.toString();
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 980594200L;
}
