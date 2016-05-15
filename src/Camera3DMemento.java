
public class Camera3DMemento {
	// point of view, or center of camera; the ego-center; the eye-point
	private Point3D position = new Point3D();

	// point of interest; what the camera is looking at; the exo-center
	private Point3D target = new Point3D();

	// This is the up vector for the (local) camera space
	private Vector3D up = new Vector3D();
	
	public Camera3DMemento() { }
	
	public Camera3DMemento(Point3D position, Point3D target, Vector3D up) {
		this.position = position;
		this.target = target;
		this.up = up;
	}

	public Point3D getPosition() {
		return position;
	}

	public void setPosition(Point3D position) {
		this.position = position;
	}

	public Point3D getTarget() {
		return target;
	}

	public void setTarget(Point3D target) {
		this.target = target;
	}

	public Vector3D getUp() {
		return up;
	}

	public void setUp(Vector3D up) {
		this.up = up;
	}
	
	
}
