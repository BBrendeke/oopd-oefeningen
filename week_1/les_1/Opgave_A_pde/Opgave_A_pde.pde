

void setup(){
  telElementenOp();
}

void telElementenOp(){
  int[] a = {5,4,6};
  int[] b = {2,6,3};
  int[] c;
  for(int i = 0; i<a.length; i++){
    for(int j = 0; j<b.length; j++){
      c = new int[i];
      c[i] = a[i]+b[j];
    }
  }
  
}