package xy.inc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "poi_location")
public class Location
{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cd_location")
	private Integer id;

	@Column(name = "ds_location", nullable=false, length=100)
	@NotEmpty(message = "Local não pode ser vazio.")
	private String location;

	@Min(0)
	@Column(name = "vl_coordinate_x", nullable=false)
	private Integer coordinate_x;

	@Min(0)
	@Column(name = "vl_coordinate_y", nullable=false)
	private Integer coordinate_y;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public Integer getCoordinate_x()
	{
		return coordinate_x;
	}

	public void setCoordinate_x(Integer coordinate_x)
	{
		this.coordinate_x = coordinate_x;
	}

	public Integer getCoordinate_y()
	{
		return coordinate_y;
	}

	public void setCoordinate_y(Integer coordinate_y)
	{
		this.coordinate_y = coordinate_y;
	}
}