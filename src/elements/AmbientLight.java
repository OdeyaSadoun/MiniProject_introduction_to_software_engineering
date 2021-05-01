package elements;
import primitives.Color;

/**
 * class to AmbientLight - the basic light in the scene
 * An ambient light source represents a fixed-intensity
 * and fixedcolor light source that affects all objects in the scene equally.
 * 
 * @author Tamar Gavrieli & Odeya Sadoun
 */
public class AmbientLight 
{
	private Color Ia; //the color
	private double Ka; //���� ������
	private Color intensity;
	
	/**
	 * constructor that save the intensity=Ia*Ka
	 * 
	 * @author Tamar Gavrieli & Odeya Sadoun
	 * @param Ia Color value
	 * @param Ka double value
	 */
	public AmbientLight(Color Ia,double Ka ) 
	{
		this.intensity = Ia.scale(Ka);
	}

	/**
	 * getter function for the intensity filed
	 * 
	 * @author Tamar Gavrieli & Odeya Sadoun
	 * @return the intensity
	 */
	public Color getIntensity() 
	{
		return intensity;
	}



}
