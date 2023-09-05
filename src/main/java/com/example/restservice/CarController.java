package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/", produces="application/json")
// @CrossOrigin(origins="*")
public class CarController {

	@GetMapping("/cars")
    public List<Car> get() {
         
        List<Car> arr = new ArrayList<>();

		String[] yearsArr = { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008",
				"2009", "2010" };

		String[] carArr = { "Chevy Malibu", "Ford F-150", "Mazda 3 Sport", "Hyundai Sonata", "Toyota Camry",
				"Mazda 6", "Hyundai Elantra", "Kia Rio", "Nissan Altima", "Honda Accord", "Honda Civic",
				"Ford Fusion", "Chevy Silverado", "GMC Sierra", "Dodge Grand Caravan" };

		Random rand = new Random();

		arr.add(new Car(yearsArr[rand.nextInt(yearsArr.length)], carArr[rand.nextInt(carArr.length)]));

		arr.add(new Car(yearsArr[rand.nextInt(yearsArr.length)], carArr[rand.nextInt(carArr.length)]));

		arr.add(new Car(yearsArr[rand.nextInt(yearsArr.length)], carArr[rand.nextInt(carArr.length)]));

		return arr;
	}

}
