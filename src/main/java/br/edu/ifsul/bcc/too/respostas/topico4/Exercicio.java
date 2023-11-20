/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.respostas.topico4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 20222PF.CC0019
 */
public class Exercicio {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Calendar cal = Calendar.getInstance();
    Collection<Pessoa> cltP = new ArrayList();

    /*
    - Criar a Main
    - Criar um construtor;
    - Criar um método que retorne a colecao Pessoa
    - Essa coleção devera ter 5 pessoas (1 func, 2 cliente e 2 aluno);
     */
 /*
         Criar um método que gere um cliente (obter dados via JOptionPane)
         Criar um método que gere um produto (obter dados via JOptionPane)
         Criar um método que gere uma foto (obter dados via JOptionPane)
         Criar um método que gere um pedido (cliente,produto e foto)
         Criar um método que imprima um pedido (todas as informações)
     */
    public Exercicio() {
        //getPessoas();
        //imprimePessoa(cltP);
        Exercicio3();
    }

    private Collection<Pessoa> getPessoas() {

        //FUNCIONARIO
        Pessoa p = new Funcionario(); // Funcionario p = new Funcionario;   Pessoa p = new Funcionario(atributos do funcionario)
        p.setCpf("02292988003");
        p.setRg("5116835512");
        p.setNome("Nicolas");
        p.setLogradouro("Bandeirantes");
        p.setNumero(1050);
        p.setPeso(75.0f);
        p.setDataNasc(Calendar.getInstance());
        p.setStatus(Boolean.TRUE);
        ((Funcionario) p).setData_admissao(Calendar.getInstance());
        ((Funcionario) p).setNumero_ctps("32");

        cltP.add(p);

        //CLIENTE
        p = new Cliente(Calendar.getInstance(), "nada");
        p.setCpf("61423521072");
        p.setRg("902154873");
        p.setNome("Igor");
        p.setLogradouro("Expedicionário");
        p.setNumero(2012);
        p.setPeso(55.0f);
        p.setDataNasc(Calendar.getInstance());
        p.setStatus(Boolean.FALSE);

        cltP.add(p);

        //CLIENTE
        p = new Cliente(Calendar.getInstance(), "deve");
        p.setCpf("52881789243");
        p.setRg("1256823");
        p.setNome("Marcela");
        p.setLogradouro("Das Vivendas");
        p.setNumero(1542);
        p.setPeso(55.0f);
        p.setDataNasc(Calendar.getInstance());
        p.setStatus(Boolean.FALSE);

        cltP.add(p);

        //ALUNO
        Aluno a = new Aluno();
        a.setCpf("76589134276");
        a.setRg("6723446");
        a.setNome("Vanderson");
        a.setLogradouro("Das Flores");
        a.setNumero(1542);
        a.setPeso(73.0f);
        a.setDataNasc(Calendar.getInstance());
        a.setStatus(Boolean.FALSE);
        a.setCoeficiente_rendimento(6.9f);
        a.setNumero_matricula("20222PF.CC0019");

        cltP.add(a);

        //ALUNO
        a = new Aluno();
        a.setCpf("82343990192");
        a.setRg("6352213");
        a.setNome("Antonio");
        a.setLogradouro("7 de Setermbro");
        a.setNumero(1542);
        a.setPeso(73.0f);
        a.setDataNasc(Calendar.getInstance());
        a.setStatus(Boolean.TRUE);
        a.setCoeficiente_rendimento(8.8f);
        a.setNumero_matricula("20200PF.CC0045");

        cltP.add(a);

        return null;
    }

    private void imprimePessoa(Collection<Pessoa> pessoas) {
        //imprimir cada elemento da coleção

        for (Pessoa j : pessoas) {

            if (j instanceof Funcionario) {
                //Funcionario func = (Funcionario) f;
                // System.out.println("CtPs: " + func.getNumero_ctps());
                System.out.println("Ctps Func: " + ((Funcionario) j).getNumero_ctps());

            } else if (j instanceof Aluno) {
                System.out.println("Matrícula Aluno: " + ((Aluno) j).getNumero_matricula());

            } else if (j instanceof Cliente) {
                System.out.println("Data Ultima Compra" + ((Cliente) j).getData_ultima_compra());

            } else if (j instanceof Pessoa) {
                System.out.println("CPF Pessoa: " + j.getCpf());

            }
        }
    }

    private void Exercicio3() {
        Cliente c = generateCliente();
        Produto p = generateProduto();
        Foto f = generateFoto();
        Pedido pd = generatePedido();
        imprimePedido(pd);

    }

    private Cliente generateCliente() {

        Cliente cli = new Cliente();
        String cpf = JOptionPane.showInputDialog(null, "CPF", "Informe o CPFe:", JOptionPane.PLAIN_MESSAGE);;
        cli.setCpf(cpf);
        String nome = JOptionPane.showInputDialog(null, "Nome", "Informe o Nome:", JOptionPane.PLAIN_MESSAGE);
        cli.setNome(nome);
        String numero = JOptionPane.showInputDialog(null, "Numero", "Informe o Numero:", JOptionPane.PLAIN_MESSAGE);
        cli.setNumero(Integer.parseInt(numero));
        String peso = JOptionPane.showInputDialog(null, "Peso: ", "Informe o Peso:", JOptionPane.PLAIN_MESSAGE);
        cli.setPeso(Float.parseFloat(peso));

        String datanasc = JOptionPane.showInputDialog(null, "Data De Nascimento dd/MM/yyyy: ", "Informe a data de nascimento", JOptionPane.PLAIN_MESSAGE);
        Calendar dataNascimento = Calendar.getInstance();

        try {
            dataNascimento.setTime(sdf.parse(datanasc));

        } catch (ParseException ex) {
            Logger.getLogger(Exercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        cli.setDataNasc(dataNascimento);

        //System.out.println(sdf.format(cli.getDataNasc().getTime()));
        String dataultimacompra = JOptionPane.showInputDialog(null, "Data Da Ultima Compra dd/MM/yyyy: ", "Informe a data da ultima compra", JOptionPane.PLAIN_MESSAGE);
        Calendar dataUltima = Calendar.getInstance();

        try {
            dataUltima.setTime(sdf.parse(dataultimacompra));

        } catch (ParseException ex) {
            Logger.getLogger(Exercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        cli.setData_ultima_compra(dataUltima);

        String observacoes = JOptionPane.showInputDialog(null, "Observações", "Informe alguma observação", JOptionPane.PLAIN_MESSAGE);
        cli.setObservacoes(observacoes);

        return cli;
    }

    private Produto generateProduto() {

        Produto prod = new Produto();
        String id = JOptionPane.showInputDialog(null,"ID","Informe o ID do produto",JOptionPane.PLAIN_MESSAGE);
        prod.setId(Integer.parseInt(id));
        
        String valor = JOptionPane.showInputDialog(null,"Valor","Informe o valor do produto",JOptionPane.PLAIN_MESSAGE);
        prod.setValor(Float.parseFloat(valor));
        
        String nome = JOptionPane.showInputDialog(null,"Nome","Informe o nome do produto",JOptionPane.PLAIN_MESSAGE);
        prod.setNome(nome); 

        
        return prod;
    }

    private Foto generateFoto(){
        
        Foto ft = new Foto();
        
        String codigo = JOptionPane.showInputDialog(null, "Codigo","Informe o Codigo da Foto",JOptionPane.PLAIN_MESSAGE);
        ft.setCodigo(Integer.parseInt(codigo));
        
        String flname = JOptionPane.showInputDialog(null, "FileName","Informe o FileName da Foto",JOptionPane.PLAIN_MESSAGE);
        ft.setFilename(flname);
        
        String path = JOptionPane.showInputDialog(null, "Path","Informe o Path da Foto",JOptionPane.PLAIN_MESSAGE);
        ft.setPath(path);
        
        
        return ft;
    }
    
    private Pedido generatePedido(){
        
        Pedido pd = new Pedido();
        
        String codigo = JOptionPane.showInputDialog(null, "Codigo","Informe o Codigo do Pedido",JOptionPane.PLAIN_MESSAGE);
        pd.setCodigo(Integer.parseInt(codigo));
        
        String datapedido = JOptionPane.showInputDialog(null, "Data Do Pedido dd/MM/yyyy: ", "Informe a data do pedido", JOptionPane.PLAIN_MESSAGE);
        Calendar dataPedido = Calendar.getInstance();

        try {
            dataPedido.setTime(sdf.parse(datapedido));

        } catch (ParseException ex) {
            Logger.getLogger(Exercicio.class.getName()).log(Level.SEVERE, null, ex);
        }
       pd.setData(dataPedido);
       
       
        String valor = JOptionPane.showInputDialog(null, "Valor Total","Informe o Valor Total do Pedido",JOptionPane.PLAIN_MESSAGE);
        pd.setValor_total(Float.parseFloat(valor));
        
        
        
        return pd;
        
    }
    
    
    
    
    
    
    private void imprimePedido(Pedido p) {
        System.out.println(p.getCliente() + " " + p.getValor_total());
    }

    public static void main(String[] args) {

        new Exercicio(); //CRIAÇÃO DA INSTANCIA

    }

}
