class car {

  String model;
  int year;

  car(this.model, this.year);

  void displayInfo() {
    print("Car Model: $model, Year: $year");
  }
}

void main() {
  car myCar = car("Toyota Corolla", 2020);
  myCar.displayInfo();
}