<h1>
TRATAMENTO DE EXCEÇÕES EM JAVA</h1>

<p>Curso que apresenta conceitos introdutórios sobre como podemos identificar e tratar Exceptions na linguagem Java. 
Curso este ministrado por mim em nome da <strong> <a href="https://web.digitalinnovation.one/home"> DIGITAL INNOVATION ONE  </a></strong> 🧡💛 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

<h2>
🛑 Pré-requistos
</h2>

- [x] Java JDK 8 ou superior
- [x] IDE para desenvolvimento Java
- [x] Conhecimento BÁSICO em OOP
- [x] Estar disposto a aprender

<h2> 📚 Ementa</h2>
<ol>
    <li>Visão Geral</li>
    <li>Unchecked Exception</li>
    <li>Checked Exception</li>
    <li>Exception Personalizada</li>
</ol>

<h2>Visão Geral</h2>
<ul>
    <li> Exceção é um evento que interrompe o fluxo normal de processamento de uma classe.
</li>
    <li> O uso correto de exceções torna o programa mais robusto e confiável.
</li>
    <li>Com o tratamento de exceções, um programa pode continuar executando depois de lidar com um problema.
</li>
    <li><em>Importante:</em> Incorpore sua estratégia de tratamento de exceções no sistema desde o princípio do processo de projeto. Pode ser difícil incluir um tratamento de exceções eficiente depois que um sistema foi implementado.
</li>
</ul>

<h3>Error:</h3> Usado pela JVM que serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar.
<h3>Unchecked (Runtime):</h3> Exceptions que PODEM ser evitados se forem tratados e analisados pelo desenvolvedor. 
<h3>Checked Exception:</h3> Exceptions que DEVEM ser evitados etratados pelo desenvolvedor para o programa funcionar.

<div align="center">
    <img src="https://i.ibb.co/VjT23Rr/amoTu.png" alt="amoTu" border="0" width="400" height="600">
    <p>Hierarquia Exceptions</p>
</div>

<h2 aling="center">Palavras Reservadas:</h2>
<ul>
    <li>try, catch, finally: Cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.</li>
    <li>throws: Declara que um método pode lançar uma ou várias exceções.</li>
    <li>throw: Lança explicitamente uma exception.</li>
</ul>

<hr>
<h2>🔸 Error</h2>
<ul>
    <li>Usado pela JVM, serve para indicar quando existe algum problema de recurso do programa, tornando a execução impossível de continuar.</li>
    <li>O “Erro” é algo que não pode mais ser tratado, ao contrário da “Exceção” que trata seus erros, pois todas as subclasses de Exception (menos as subclasses RuntimeException) são exceções que obrigatóriamente devem ser tratadas.</li>
</ul>

<h2>🔸 Unchecked Exception</h2>
<ul>
    <li>Herdam da classe <em>RuntimeException</em> ou da classe <em>Error</em>.</li>
    <li>O compilador não verifica o código para ver se a exceção foi capturada ou declarada.</li>
    <li>Se uma exceção não-verificada ocorrer e não tiver sido capturada, o programa terminará ou executará com resultados inesperados.</li>
    <li>Em geral, podem ser evitadas com uma codificação adequada.</li>
</ul>

<h2>🔸 Checked Exception</h2>
<ul>
    <li>As exceções que são herdadas da classe <em>Exception</em>, mas não de <em>RuntimeException</em>.</li>
    <li>O compilador impõe um requisito do tipo "capturar ou declarar".</li>
    <li>O compilador verifica cada chamada de método e declaração de método para determinar se o método lança (<em>throws</em>) exceções verificadas.</li>
    <li>Se lançar, o compilador assegura que a exceção verificada é capturada ou declarada em uma cláusula <em>throws</em>. 
    <li>Caso não capturada nem declarada, ocorre um erro de compilação.
</li>
</ul>

<h2>🔸 Exception Personalizada</h2>
<ul>
    <li>Programadores podem achar útil declarar suas próprias classes de exceção.</li>
    <li>Essas Exceptions são específicas aos problemas que podem ocorrer quando outro programador empregar suas classes reutilizáveis.
</li>
    <li>Uma nova classe de exceção deve estender uma classe de exceção existente que assegura que a classe pode ser utilizada com o mecanismo de tratamento de exceções, logo essas Exceções customizadas são derivadas da classe Exception.</li>
    <li><em>Importante</em>: Antes de criar a nossa própria exceção, é recomendado verificar se já existe alguma exceção na biblioteca Java que já nos forneça o que precisamos. Afinal, não queremos reinventar a roda!</li>
</ul>

<h2>🔸 Blocos try/catch/finally</h2>
<ul>
    Bloco <strong><em>try</em></strong>:
    <li>Região onde se encontra o código que queremos verificar se irá ou não lançar uma exceção.</li>
    <li>Caso ocorra uma exceção em algum ponto, o restante do código contido no bloco <em>try</em> não será executado.</li>
    <li>O bloco <em>try</em> não pode ser declarado sozinho, por tanto, precisa estar seguido de um ou vários blocos <em>catch</em> e/ou de um bloco <em>finally</em>.</li>
</ul>
<ul>
    Bloco <strong><em>catch</em></strong>:
    <li>Região onde se encontra o possível tratamento da exceção. Isso significa que só será executado caso o bloco <em>try</em> apresentar alguma exceção.</li>
    <li>Recebe como argumento a classe ou subclasse da possível exceção.</li>
    <li>No seu escopo ficam as instruções de como tratar essa exceção.</li>
    <li>Pode haver mais de um bloco <em>catch</em>, porém, será executado apenas o primeiro bloco que identificar a exceção.</li>
    <li><em>Importante</em>: Caso você utilize mais de um <em>catch</em> e houver exceções de uma mesma hierarquia de classes, certifique-se que a classe mais genérica esteja como argumento do último <em>catch</em>. Caso contrário, qualquer exceção sempre cairá neste primeiro <em>catch</em>, assim fazendo com que a exception mais específica não seja verificada.</li>
</ul>
<ul>
    Bloco <strong><em>finally</em></strong>:
    <li>Este bloco é opcional, mas caso seja construído, quase sempre será executado. (A menos que seja forçada sua parada, por exemplo, com um System.exit(0), no <em>catch</em>)</li>
    <li>Dentro do bloco <em>finally</em>, poderá conter outros blocos <em>try, catch,</em> bem como outro <em>finally</em>.</li>
    </li>Geralmente utilizado quando precisamos executar algum código independente se ocorrer exception ou não.</li>
</ul>

<h2>🔸 Cláusulas throws e throw</h2>
<ul>
    Cláusula <strong><em>throws</em></strong>
    <li>Usada na assinatura do método.</li>
    <li>Necessária apenas para exceções checked. </li>
    <li>Informa ao chamador que este método pode lançar uma das exceções listadas no escopo do método. Isso obriga a fazer a captura dessa exception (<em>try-catch</em>) ou relançar o <em>throws</em>. </li>
</ul>
<ul>
    Cláusula <strong><em>throw</em></strong>
    <li>É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código.</li>
    <li>Usada principalmente para lançar exceções personalizadas</li>
    <em>Importante</em>:    
    <li>O fluxo de execução "normal" do programa para imeditamente apos a execução da cláusula <em>throw</em>. O bloco <em>try</em> envolvente mais próximo é verificado para encontrar um bloco <em>catch</em> que corresponda ao tipo de exceção.</li>
    <li>Caso encontre essa correspondência, o controlado é transferido para esse bloco. Caso contrário, o próximo bloco <em>try</em> envolvente é verificado e assim por diante.</li>
    <li>Outro caso, é se nenhuma captura for encontrada, o manipulador da exceção padrão interromperá o programa.</li>

</ul>

<h2>🔗 Referências</h2>
<ul>
    <li>https://www.devmedia.com.br/trabalhando-com-excecoes-em-java/27601</li>
    <li>https://www.youtube.com/watch?v=ld2C4GcAtsg&t=296s</li>
    <li>https://www.programcreek.com/2009/02/diagram-for-hierarchy-of-exception-classes/</li>
    <li>https://www.projetojavaweb.com/certificado-aluno/plataforma-curso/aulaatual/467726283/idcurso/1/idvideoaula/161</li>
    <li>https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Error.html</li>
    <li>https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html</li>
    <li>https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html</li>
    <li>https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html</li>
</ul>

<h2> 🤝 Contribuindo </h2>

Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.

Se possível:

⭐️  Star o projeto

🐛 Encontrar e relatar issues


------------

Disponibilizado com ♥ por [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").
