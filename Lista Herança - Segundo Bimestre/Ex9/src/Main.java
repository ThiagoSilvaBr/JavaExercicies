public class Main {
    public static void main(String[] args) {
        /*
            9. Pensando em Relacionamentos (Conceitual)
                Você está modelando um sistema universitário. Você tem os conceitos Universidade e Departamento (ex:
                "Departamento de Computação"). Um Departamento "é-um-tipo-de" Universidade (Herança) ou uma
                Universidade "tem-muitos" Departamentos (Composição)? Justifique sua escolha de design.

                R- Uma universidade pode possuir vários departamentos, sendo assim o correto seria utilizar uma composição. Já
                na criação de diversos departamentos dentro de uma universidade, poderia ser utilizado herança de uma classe pai chamada
                Departamento com seus atributos e SubClasses como DepartamentoComputação, pois possuirão atributos identicos ao Departamento
                padrão, apenas com atributos adicionais.


        */
    }
}