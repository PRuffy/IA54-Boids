/**
 * $Id$
 * 
 * Copyright (c) 2011-17 Stephane GALLAND <stephane.galland@utbm.fr>.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * This program is free software; you can redistribute it and/or modify
 */
package framework.environment;

import framework.environment.SituatedObject;
import framework.math.Vector2f;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;

/**
 * Object on the environment.
 * 
 * @author St&eacute;phane GALLAND &lt;stephane.galland@utbm.fr&gt;
 * @version $Name$ $Revision$ $Date$
 */
@SarlSpecification("0.6")
@SarlElementType(10)
@SuppressWarnings("all")
public interface MobileObject extends SituatedObject {
  /**
   * Replies the orientation of the object.
   * 
   * @return the angle of orientation from (1,0).
   */
  public abstract float getAngle();
  
  /**
   * Replies the orientation of the object.
   * 
   * @return the orientation direction.
   */
  public abstract Vector2f getDirection();
  
  /**
   * Replies the max linear speed.
   * 
   * @return the max linear speed.
   */
  public abstract float getMaxLinearSpeed();
  
  /**
   * Replies the max angular speed.
   * 
   * @return the max angular speed.
   */
  public abstract float getMaxAngularSpeed();
  
  /**
   * Replies the max linear acceleration.
   * 
   * @return the max linear acceleration.
   */
  public abstract float getMaxLinearAcceleration();
  
  /**
   * Replies the max angular acceleration.
   * 
   * @return the max angular acceleration.
   */
  public abstract float getMaxAngularAcceleration();
  
  /**
   * Replies the current angular speed.
   * 
   * @return the current angular speed.
   */
  public abstract float getCurrentAngularSpeed();
  
  /**
   * Replies the current linear speed.
   * 
   * @return the current linear speed.
   */
  public abstract float getCurrentLinearSpeed();
  
  /**
   * Replies the current linear motion.
   * 
   * @return the current linear motion.
   */
  public abstract Vector2f getCurrentLinearMotion();
}
