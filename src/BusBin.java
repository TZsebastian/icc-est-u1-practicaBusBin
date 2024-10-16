
public class BusBin {
    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                System.out.println(); 
                System.out.println("Encontrado");
                return medio;
            }

            if (arr[medio] < value) {
                inicio = medio + 1; // Buscar en la mitad de la derecha
                System.out.println("Seguir a la derecha");
            } else {
                fin = medio - 1; // Buscar en la mitad de la izquierda
                System.out.println("Seguir a la izquierda");
            }
        }
        return -1;
    }
     public void sortByEdad(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            while (j >= 0 ) {

                arreglo[j + 1] = arreglo[j];
                j = j - 1;
                arreglo[j + 1] = aux;

            }
        }
    }
}
