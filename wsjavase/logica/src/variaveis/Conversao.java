import javax.swing.JOptionPane;
class Conversao{
	public static void main(String args[]){
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina:");
		//System.out.println("Aluno: " + nome);
		//System.out.println("Matéria: " + disciplina);
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
		float media = (nota1 + nota2)/2;
		JOptionPane.showMessageDialog(null,"Aluno: " + nome +"\nMateria: " + disciplina+"\nMedia: "+media);
	}
}