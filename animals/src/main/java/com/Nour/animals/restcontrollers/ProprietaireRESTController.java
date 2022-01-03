package com.Nour.animals.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.entities.Proprietaire;
import com.Nour.animals.service.AnimalService;
import com.Nour.animals.service.ProprietaireService;

@RestController
@RequestMapping("/propapi")
@CrossOrigin
public class ProprietaireRESTController {
@Autowired
ProprietaireService proprietaireService;

@RequestMapping(method = RequestMethod.GET)
public List<Proprietaire> getAllProprietaires() {
return proprietaireService.getAllProprietaires();
}


/*@RequestMapping(value="/{numP}",method = RequestMethod.GET)
public Proprietaire getProprietaireById(@PathVariable("numP") Long numP) {
return proprietaireService.getProprietaire(numP);
 }
*/
@RequestMapping(method = RequestMethod.POST)
public Proprietaire createProprietaire(@RequestBody Proprietaire proprietaire) {
return proprietaireService.saveProprietaire(proprietaire);
}

@RequestMapping(method = RequestMethod.PUT)
public Proprietaire updateProprietaire(@RequestBody Proprietaire proprietaire) {
return proprietaireService.updateProprietaire(proprietaire);
}

@RequestMapping(value="/{numP}",method = RequestMethod.DELETE)
public void deleteProprietaire(@PathVariable("numP") Long numP)
{
	proprietaireService.deleteProprietaireById(numP);
}

/*@RequestMapping(value="/animalprop/{numA}",method = RequestMethod.GET)
public List<Proprietaire> getAnimalsByCatId(@PathVariable("numA") Long numA) {
return proprietaireService.findByAnimalNumA(numA);
}*/
@RequestMapping(value="/{numP}",method = RequestMethod.GET)
public Proprietaire getProprietaireById(@PathVariable("numP") Long id) {
return proprietaireService.getProprietaire(id);
}


}
