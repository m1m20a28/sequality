package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(double x, Double y) {
    return x / y;
  }

  public int atoz(int x, int y) {
    int hoge = 0;
    if (x > y) {
      int tmp = x;
      x = y;
      y = tmp;
    }
    for (int i = x; i <= y; i++){
      hoge += i;
    }
    return hoge;
  }

  public int odd(int x, int y) {
    if (x > y) {
      int tmp = x;
      x = y;
      y = tmp;
    }
    int hoge = 0;
    for (int i = x; i <= y; i++) {
      if(i % 2 == 1)
        hoge += i;
    }
    return hoge;
  }

  public int even(int x, int y) {
    if (x > y) {
      int tmp = x;
      x = y;
      y = tmp;
    }
    int hoge = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0)
        hoge += i;
    }
    return hoge;
  }
}
