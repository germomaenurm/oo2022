interface Hulknurk {
  void leiaPindala();

  default void leiaKyljed() {
    System.out.println("Ma saan leida hulknurga küljed.");
  }
}