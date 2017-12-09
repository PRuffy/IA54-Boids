package boids.math;

import framework.math.Point2f;
import framework.math.Rectangle2f;
import framework.math.Shape2f;
import framework.math.Tuple2f;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.6")
@SarlElementType(9)
@SuppressWarnings("all")
public class Triangle2f extends Shape2f<Triangle2f> {
  private final Point2f firstPoint = new Point2f();
  
  private final Point2f secondPoint = new Point2f();
  
  private final Point2f thirdPoint = new Point2f();
  
  public Triangle2f(final float x1, final float y1, final float x2, final float y2, final float x3, final float y3) {
    this.firstPoint.set(x1, y1);
    this.secondPoint.set(x2, y2);
    this.thirdPoint.set(x3, y3);
  }
  
  public boolean intersects(final Shape2f<?> r) {
    Rectangle2f rectangleOtherShape = r.getBounds();
    Rectangle2f thisRectangle = r.getBounds();
    return thisRectangle.intersects(rectangleOtherShape);
  }
  
  @Pure
  public Triangle2f translate(final Tuple2f<?> vector) {
    float _x = this.firstPoint.getX();
    float _x_1 = vector.getX();
    float _plus = (_x + _x_1);
    float _y = this.firstPoint.getY();
    float _y_1 = vector.getY();
    float _plus_1 = (_y + _y_1);
    float _x_2 = this.secondPoint.getX();
    float _x_3 = vector.getX();
    float _plus_2 = (_x_2 + _x_3);
    float _y_2 = this.secondPoint.getY();
    float _y_3 = vector.getY();
    float _plus_3 = (_y_2 + _y_3);
    float _x_4 = this.thirdPoint.getX();
    float _x_5 = vector.getX();
    float _plus_4 = (_x_4 + _x_5);
    float _y_4 = this.thirdPoint.getY();
    float _y_5 = vector.getY();
    float _plus_5 = (_y_4 + _y_5);
    return new Triangle2f(_plus, _plus_1, _plus_2, _plus_3, _plus_4, _plus_5);
  }
  
  public Rectangle2f getBounds() {
    float _max = Math.max(this.firstPoint.getX(), Math.max(this.secondPoint.getX(), this.thirdPoint.getX()));
    float _max_1 = Math.max(this.firstPoint.getY(), Math.max(this.secondPoint.getY(), this.thirdPoint.getY()));
    float _min = Math.min(this.firstPoint.getX(), Math.min(this.secondPoint.getX(), this.thirdPoint.getX()));
    float _min_1 = Math.min(this.firstPoint.getY(), Math.min(this.secondPoint.getY(), this.thirdPoint.getY()));
    return new Rectangle2f(_max, _max_1, _min, _min_1);
  }
  
  public float getMaxDemiSize() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
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
  
  @Override
  @Pure
  @SyntheticMember
  public Triangle2f clone() {
    try {
      return (Triangle2f) super.clone();
    } catch (Throwable exception) {
      throw new Error(exception);
    }
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -771482163L;
}
