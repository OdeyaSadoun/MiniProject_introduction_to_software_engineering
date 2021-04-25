package geometries;

import primitives.Ray;

import java.util.List;

import primitives.Point3D;
/**
 * Interface for Intsersections
 * 
 * @author Tamar Gavrieli 322533977 and Odeya Sadoun 212380406
 */
public interface Intersectable 
{
	/**
	 * A function that return all the intersection point with geometry
	 * 
	 * @author Tamar Gavrieli 322533977 and Odeya Sadoun 212380406
	 * @param ray
	 * @return List<Point3D>
	 * @throws Exception
	 * */
	List<Point3D> findIntersections(Ray ray) throws Exception;

}
