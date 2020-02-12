package sqlProject;

public class PlanetVO {
	private int id;
	private String name;
	private float gravity;
	private int type;
	private String creature;
	private String resource;
	private String wonder;
	private String satelliteMatch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCreature() {
		return creature;
	}

	public void setCreature(String creature) {
		this.creature = creature;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getWonder() {
		return wonder;
	}

	public void setWonder(String wonder) {
		this.wonder = wonder;
	}

	public String getSatelliteMatch() {
		return satelliteMatch;
	}

	public void setSatelliteMatch(String satelliteMatch) {
		this.satelliteMatch = satelliteMatch;
	}

	public String toString() {
		return id + "\t" + name + "\t" + creature 
				+ "\t" + resource + "\t" +  wonder;
	}
}
