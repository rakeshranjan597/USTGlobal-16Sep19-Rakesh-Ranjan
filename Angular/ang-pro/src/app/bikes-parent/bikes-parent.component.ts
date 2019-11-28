import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes-parent',
  templateUrl: './bikes-parent.component.html',
  styleUrls: ['./bikes-parent.component.css']
})
export class BikesParentComponent implements OnInit {
  selectedBike;
  bikes = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      name : 'BMW',
      // tslint:disable-next-line: max-line-length
      about : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
      name : 'Suzuki',
      // tslint:disable-next-line: max-line-length
      about : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865__340.jpg',
      name : 'Interceptor',
      // tslint:disable-next-line: max-line-length
      about : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'Royal Enfield',
      // tslint:disable-next-line: max-line-length
      about : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/07/01/03/47/bike-2460493__340.jpg',
      name : 'Gixer',
      // tslint:disable-next-line: max-line-length
      about : 'Specs overview. Engine. 2.5-liter five-cylinder. Horsepower. 394. Acceleration (0—60 mph) 3.9 seconds. Torque (lb-ft @ rpm) 354. Transmission. Seven-speed S tronic® dual-clutch automatic transmission and quattro® all-wheel drive. Top speed. 155 mph 7. Valvetrain. 20-valve DOHC with Audi valvelift. Combined mpg.'
    },
  ];

  constructor() { }

  ngOnInit() {
  }

  sendBike(bike) {
    this.selectedBike = bike;
    console.log(bike);
  }
}
