class Shape {

  int getCorner(){
    return 0;
  }

}

class Rectangle extends Shape {

  @Override
  int getCorner(){
    return 4;
  } 

  int getParentCorner(){
    return super.getCorner();
  }

}
