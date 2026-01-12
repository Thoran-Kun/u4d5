void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("inserisci il numero di kilometri percorsi: ");
        double km = Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci il numero dei litri consumati: ");
        double lt = Integer.parseInt(scanner.nextLine());

        if (lt == 0) {
            throw new ArithmeticException("litri uguali a Zero: non valido!");
        }

        double kmPerLitro = km / lt;
        System.out.println("il consumo è di: " + kmPerLitro + "km/lt");
    } catch (NumberFormatException e) {
        System.out.println("non valido: devi inserire un numero non una stringa");
    } catch (ArithmeticException e) {
        System.out.println("non puoi inserire 0 come valore dei litri consumati " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Errore imprevisto: " + e.getMessage());
    }
}