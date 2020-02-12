package sqlProject;

import java.sql.Date;

public class MyRecordVO {
	private int id;
	private int planetId;
	private Date discoveryTime;
	private int level;
	private String connectingSatellite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlanetId() {
		return planetId;
	}

	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}

	public Date getDiscoveryTime() {
		return discoveryTime;
	}

	public void setDiscoveryTime(Date discoveryTime) {
		this.discoveryTime = discoveryTime;

	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getConnectingSatellite() {
		return connectingSatellite;
	}

	public void setConnectingSatellite(String connectingSatellite) {
		this.connectingSatellite = connectingSatellite;
	}

	public String toString() {
		return id + "\t" + planetId;
	}
}
