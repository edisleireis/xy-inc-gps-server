package xy.inc.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController ;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import xy.inc.model.Location;
import xy.inc.repository.LocationRepository;

@RestController
@Api(tags = "Localizacoes")
@RequestMapping("/v1/locations")
public class LocationController
{
    @Autowired
    LocationRepository repository;

    @RequestMapping(value = "/findall", method = RequestMethod.GET, produces={"application/json"})
    @ApiOperation(value = "Retorna uma lista de POIs", notes = "Utilize este método para listar os Pontos de Interesse registrados.")
    public List<Location> findLocations()
    {
    	return (List<Location>) repository.findAll();
    }

	@RequestMapping(value = "/findbydistance", method = RequestMethod.GET, produces={"application/json"})
    @ApiOperation(value = "Retorna uma lista de POIs por Proximidade", notes = "Utilize este método para listar os Pontos de Interesse com base na distância.")
    public List<Location> findLocationsByDistance(@RequestParam(value="coordinate_x") Integer coordinate_x, @RequestParam(value="coordinate_y") Integer coordinate_y, @RequestParam(value="distance") Double distance)
    {
    	return (List<Location>) repository.findByDistance(coordinate_x, coordinate_y, distance);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces={"application/json"})
    @ApiOperation(value = "Registra novo POI", notes = "Utilize este método para cadastrar novos Pontos de Interesse. Informe o nome e as coodenadas X e Y.")
    public Location registerLocation(@Valid @RequestBody Location location)
    {
		return repository.save(location);
    }
}