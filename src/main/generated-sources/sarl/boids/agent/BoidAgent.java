package boids.agent;

import boids.environment.BoidBody;
import com.google.common.base.Objects;
import framework.environment.SituatedObject;
import framework.math.Point2f;
import framework.math.Vector2f;
import io.sarl.core.Destroy;
import io.sarl.core.Initialize;
import io.sarl.core.Logging;
import io.sarl.lang.annotation.ImportedCapacityFeature;
import io.sarl.lang.annotation.PerceptGuardEvaluator;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Agent;
import io.sarl.lang.core.BuiltinCapacitiesProvider;
import io.sarl.lang.core.DynamicSkillProvider;
import io.sarl.lang.core.Skill;
import io.sarl.lang.util.ClearableReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author stay
 */
@SarlSpecification("0.6")
@SarlElementType(17)
@SuppressWarnings("all")
public class BoidAgent extends Agent {
  private UUID body;
  
  @SyntheticMember
  private void $behaviorUnit$Initialize$0(final Initialize occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER = this.$castSkill(Logging.class, (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = this.$getSkill(Logging.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
    _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER.info("The agent was started.");
  }
  
  @SyntheticMember
  private void $behaviorUnit$Destroy$1(final Destroy occurrence) {
    Logging _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER = this.$castSkill(Logging.class, (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = this.$getSkill(Logging.class)) : this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
    _$CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER.info("The agent was stopped.");
  }
  
  @Pure
  protected void computeInfluence(final ArrayList<SituatedObject> perception) {
    Vector2f influenceVector = null;
    Vector2f _vector2f = new Vector2f();
    influenceVector = _vector2f;
    BoidBody myBody = null;
    for (final SituatedObject p : perception) {
      UUID _iD = p.getID();
      boolean _equals = Objects.equal(_iD, this.body);
      if (_equals) {
        myBody = ((BoidBody) p);
      }
    }
  }
  
  @Pure
  protected Vector2f repulsionForce(final ArrayList<SituatedObject> perception, final BoidBody myBody) {
    Vector2f tempVect = null;
    Vector2f _vector2f = new Vector2f();
    tempVect = _vector2f;
    return tempVect;
  }
  
  protected Vector2f cohesionForce(final ArrayList<BoidBody> perception, final BoidBody myBody) {
    Vector2f tempVect = null;
    Vector2f _vector2f = new Vector2f();
    tempVect = _vector2f;
    int nbTot = 0;
    for (final BoidBody otherBoid : perception) {
      if (((!Objects.equal(otherBoid.getID(), this.body)) && (otherBoid.getGroup() == myBody.getGroup()))) {
        nbTot++;
        Point2f _position = otherBoid.getPosition();
        Point2f _position_1 = myBody.getPosition();
        Vector2f _minus = _position.operator_minus(_position_1);
        Vector2f _vector2f_1 = new Vector2f(_minus);
        tempVect.operator_add(_vector2f_1);
      }
    }
    if ((nbTot > 0)) {
      Vector2f _divide = tempVect.operator_divide(nbTot);
      tempVect = _divide;
    }
    return tempVect;
  }
  
  protected Vector2f alignementForce(final ArrayList<BoidBody> perception, final BoidBody myBody) {
    Vector2f tempVect = null;
    Vector2f _vector2f = new Vector2f();
    tempVect = _vector2f;
    Vector2f alignement = null;
    Vector2f _vector2f_1 = new Vector2f();
    alignement = _vector2f_1;
    int nbTot = 0;
    for (final BoidBody otherBoid : perception) {
      if (((!Objects.equal(otherBoid.getID(), this.body)) && (otherBoid.getGroup() == myBody.getGroup()))) {
        nbTot++;
        tempVect.set(otherBoid.getCurrentLinearMotion());
        float _currentLinearSpeed = otherBoid.getCurrentLinearSpeed();
        Vector2f _divide = tempVect.operator_divide(_currentLinearSpeed);
        tempVect = _divide;
        alignement.operator_add(tempVect);
      }
    }
    if ((nbTot > 0)) {
      Vector2f _divide_1 = alignement.operator_divide(nbTot);
      alignement = _divide_1;
    }
    return alignement;
  }
  
  protected Vector2f separationForce(final ArrayList<BoidBody> perception, final BoidBody myBody) {
    Vector2f temp = null;
    Vector2f force = null;
    Vector2f _vector2f = new Vector2f();
    force = _vector2f;
    float len = 0;
    int nbTot = 0;
    for (final BoidBody otherBoid : perception) {
      if (((!Objects.equal(otherBoid.getID(), this.body)) && (otherBoid.getGroup() == myBody.getGroup()))) {
        nbTot++;
        Point2f _position = myBody.getPosition();
        Point2f _position_1 = otherBoid.getPosition();
        Vector2f _minus = _position.operator_minus(_position_1);
        Vector2f _vector2f_1 = new Vector2f(_minus);
        temp = _vector2f_1;
        len = temp.lengthSquared();
        Vector2f _divide = temp.operator_divide(len);
        temp = _divide;
        force.operator_add(temp);
      }
    }
    return force;
  }
  
  @Extension
  @ImportedCapacityFeature(Logging.class)
  @SyntheticMember
  private transient ClearableReference<Skill> $CAPACITY_USE$IO_SARL_CORE_LOGGING;
  
  @SyntheticMember
  @Pure
  @Inline(value = "$castSkill(Logging.class, ($0$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || $0$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) ? ($0$CAPACITY_USE$IO_SARL_CORE_LOGGING = $0$getSkill(Logging.class)) : $0$CAPACITY_USE$IO_SARL_CORE_LOGGING)", imported = Logging.class)
  private Logging $CAPACITY_USE$IO_SARL_CORE_LOGGING$CALLER() {
    if (this.$CAPACITY_USE$IO_SARL_CORE_LOGGING == null || this.$CAPACITY_USE$IO_SARL_CORE_LOGGING.get() == null) {
      this.$CAPACITY_USE$IO_SARL_CORE_LOGGING = $getSkill(Logging.class);
    }
    return $castSkill(Logging.class, this.$CAPACITY_USE$IO_SARL_CORE_LOGGING);
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Initialize(final Initialize occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Initialize$0(occurrence));
  }
  
  @SyntheticMember
  @PerceptGuardEvaluator
  private void $guardEvaluator$Destroy(final Destroy occurrence, final Collection<Runnable> ___SARLlocal_runnableCollection) {
    assert occurrence != null;
    assert ___SARLlocal_runnableCollection != null;
    ___SARLlocal_runnableCollection.add(() -> $behaviorUnit$Destroy$1(occurrence));
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
    BoidAgent other = (BoidAgent) obj;
    if (!java.util.Objects.equals(this.body, other.body)) {
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
    result = prime * result + java.util.Objects.hashCode(this.body);
    return result;
  }
  
  @SyntheticMember
  public BoidAgent(final UUID parentID, final UUID agentID) {
    super(parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  @Deprecated
  public BoidAgent(final BuiltinCapacitiesProvider provider, final UUID parentID, final UUID agentID) {
    super(provider, parentID, agentID);
  }
  
  @SyntheticMember
  @Inject
  public BoidAgent(final UUID parentID, final UUID agentID, final DynamicSkillProvider skillProvider) {
    super(parentID, agentID, skillProvider);
  }
}
