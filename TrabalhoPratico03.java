//// Matheus Penteado e Kaik Persike
/*TRABALHO PRÁTICO 03: Construir a classe Hora, conforme especificação
abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua
elaboração para a prova final.

• O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
• O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
segundos e com eles inicializa as propriedades da classe;
• Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e
atribuí-lo ao respectivo atributo;
• Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um
valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
• Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
propriedades;
• O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
• O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);
• O método getSegundos() deve nos devolver a quantidade de segundos expressa na
hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
• Conveniente colocar tratamento de exceção para as possíveis inconsistências na
entrada de dados.

*/ 
package trabalhopratico03;
public class TrabalhoPratico03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Teste com entrada do usuário
        System.out.println("=== Teste com entrada do usuário ===");
        Hora hora1 = new Hora();  // Vai pedir os valores via teclado
        System.out.println("Hora 1 (formato 24h): " + hora1.getHora1());
        System.out.println("Hora 1 (formato 12h): " + hora1.getHora2());
        System.out.println("Hora 1 em segundos: " + hora1.getSegundos());

        // Teste com valores diretos
        System.out.println("\n=== Teste com valores diretos ===");
        Hora hora2 = new Hora(14, 30, 45);  // Deveria ser 14:30:45
        System.out.println("Hora 2 (formato 24h): " + hora2.getHora1());
        System.out.println("Hora 2 (formato 12h): " + hora2.getHora2());
        System.out.println("Hora 2 em segundos: " + hora2.getSegundos());

        // Teste dos setters
        System.out.println("\n=== Teste de setters ===");
        hora2.setHor(22);
        hora2.setMin(59);
        hora2.setSeg(59);
        System.out.println("Hora 2 atualizada (formato 24h): " + hora2.getHora1());
    }
    
}
