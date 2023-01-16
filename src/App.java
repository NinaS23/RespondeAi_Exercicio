public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setCurso("engenharia de software");
        curso.conteudo.setConteudo("sistemas operacionais");
         
        System.out.println(curso.getCurso());
        System.out.println(curso.conteudo.getConteudo());
    }
}
