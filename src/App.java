import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class App {
   
    public static void main(String[] args) throws Exception {
        tocarMusica("audio.wav");


        Font fonteRomantica = new Font("Serif", Font.PLAIN, 40); 
        try {
            fonteRomantica = Font.createFont(Font.TRUETYPE_FONT, new File("ava.ttf")).deriveFont(32f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fonteRomantica);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Font fonteMensagem = new Font("Serif", Font.BOLD, 40); 
        try {
            fonteMensagem = Font.createFont(Font.TRUETYPE_FONT, new File("agora.ttf")).deriveFont(25f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fonteMensagem);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Font fonteBotao = new Font("Serif", Font.BOLD, 40); 
        try {
            fonteBotao = Font.createFont(Font.TRUETYPE_FONT, new File("agora.ttf")).deriveFont(16f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fonteBotao);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
      
        JFrame janela = new JFrame("Para Meu Amor💌");   //criar um obejto e dentro do () posso dar o nome da minha janela

        
        // titulo
        JLabel titulo = new JLabel("Feliz Aniversário Amor");
        titulo.setBounds(120,40,350,40);
        titulo.setFont(fonteRomantica);
        titulo.setForeground(Color.DARK_GRAY);
        titulo.setForeground(new Color(33,33,33));


        JButton botao1 = new JButton("Mensagem 1 ");
        botao1.setBounds(75,90,200,40);
        botao1.setBackground(new Color(255,190,180));
        botao1.setForeground(new Color(33,33,33));
        botao1.setBorderPainted(false);
        botao1.setFocusPainted(false);
        botao1.setFont(fonteBotao);

        JButton botao2 = new JButton("Mensagem 3");
        botao2.setBounds(75,140,200,40);
        botao2.setBackground(new Color(255,190,180));
        botao2.setForeground(new Color(33,33,33));
        botao2.setBorderPainted(false);
        botao2.setFocusPainted(false);
        botao2.setFont(fonteBotao);

        JButton botao3 = new JButton("Mensagem 4 ");
        botao3.setBounds(295,140,200,40);
        botao3.setBackground(new Color(255,190,180));
        botao3.setForeground(new Color(33,33,33));
        botao3.setBorderPainted(false);
        botao3.setFocusPainted(false);
        botao3.setFont(fonteBotao);

        JButton botao4 = new JButton("Mensagem  2 ");
        botao4.setBounds(295,90,200,40);
        botao4.setBackground(new Color(255,190,180));
        botao4.setForeground(new Color(33,33,33));
        botao4.setBorderPainted(false);
        botao4.setFocusPainted(false);
        botao4.setFont(fonteBotao);
        

        // mgns ao clicar
        JLabel mgn1 = new JLabel(
    "<html>Você é a escolha que meu coração faria em todas<br>" +
     "as vidas, todos os dias, sem hesitar<br>" 
    
);
        mgn1.setBounds(80,220,450,50);
        mgn1.setVisible(false);
        mgn1.setForeground(new Color(33,33,33));
        mgn1.setFont(fonteMensagem);
        

        JLabel mgn2 = new JLabel(
    "<html>Te amar é sentir que,mesmo no caos,<br>"+
     "meu lar sempre foi o teu abaraço<br>"
);
        mgn2.setBounds(80,220,450,60);
        mgn2.setVisible(false);
        mgn2.setForeground(new Color(33,33,33));
        mgn2.setFont(fonteMensagem);

        JLabel mgn3 = new JLabel(
    "<html>Você é meu recomeço diario, minha paz<br>"+
     "em meio ás guerras que ja enfrentamos Te Amo❤️<br>"
);
        mgn3.setBounds(80,220,450,65);
        mgn3.setVisible(false);
        mgn3.setForeground(new Color(33,33,33));
        mgn3.setFont(fonteMensagem);

        JLabel mgn4 = new JLabel(
    "<html>Nos seus olhos, eu encontrei tudo o que o mundo<br>"+
     "jamais poderia me dar<br>"

);
        mgn4.setBounds(90,220,460,60);
        mgn4.setVisible(false);
        mgn4.setForeground(new Color(33,33,33));
        mgn4.setFont(fonteMensagem);



        Runnable esconderMgn = () -> {
            mgn1.setVisible(false);
            mgn2.setVisible(false);
            mgn3.setVisible(false);
            mgn4.setVisible(false);

            
        };

        // ação dos botoes
        botao1.addActionListener(e -> {
            esconderMgn.run();
            mgn1.setVisible(true);

        });
        botao2.addActionListener(e ->{
            esconderMgn.run();
            mgn2.setVisible(true);
        });
        botao3.addActionListener(e ->{
            esconderMgn.run();
            mgn3.setVisible(true);
        });
        botao4.addActionListener(e ->{
            esconderMgn.run();
            mgn4.setVisible(true);
        });


        // abrir uma nova janela dentro de outra janela
        JButton abrirJanelaBtn = new JButton("Vamos Jogar?");
    abrirJanelaBtn.setBounds(10, 420, 200, 30);
    abrirJanelaBtn.setBorderPainted(false);
    abrirJanelaBtn.setFocusPainted(false);
    //abrirJanelaBtn.setContentAreaFilled(false);
    abrirJanelaBtn.setForeground(new Color(33,33,33));
    abrirJanelaBtn.setFont(new Font("Arial", Font.BOLD,12));
    abrirJanelaBtn.setFont(fonteBotao);

abrirJanelaBtn.addActionListener(e -> extracted(janela));



  // add componentes a janela
        janela.add(abrirJanelaBtn);
        janela.add(titulo); 
        //janela.add(ani);
        //janela.add(ani2);
        janela.add(botao1);
        janela.add(mgn1);
        janela.add(botao2);
        janela.add(mgn2);
        janela.add(botao3);
        janela.add(mgn3);
        janela.add(botao4);
        janela.add(mgn4);
        

        // criação da janela
        janela.setLayout(null);
        janela.setBounds(50,90,600,500); //definir a altura e largura da janela
        janela.getContentPane().setBackground(new Color(238,238,238));
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //aqui estou definindo quando apertar o x a janela fecha
        janela.setVisible(true);  //aqui estou avisando que minha janela esta visivel
        janela.setLocationRelativeTo(null);
        janela.setMaximizedBounds(janela.getBounds()); //aqui impede da maximizar a janela

 
    }

    public static void tocarMusica(String caminho) {
    try {
        File arquivo = new File(caminho);
        if (!arquivo.exists()) {
            JOptionPane.showMessageDialog(null, "Arquivo de música não encontrado: " + caminho);
            return;
        }

        AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao tocar música.");
    }
}


    private static void extracted(JFrame janela) {
        JFrame novaJanela = new JFrame("Nova Janela 💌");
        novaJanela.getContentPane().setBackground(new Color(238,238,238));
        novaJanela.setSize(400, 200);
        novaJanela.setLayout(null);
        novaJanela.setLocationRelativeTo(null);
        novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Só fecha essa janela
        novaJanela.setMaximizedBounds(janela.getBounds());
        novaJanela.setResizable(false);
        

        JLabel texto = new JLabel("De 0 a ... o Quanto você me ama?💕");
        texto.setBounds(60, 10, 300, 30);

        

        JTextField resposta = new JTextField();
        resposta.setBounds(60,32,60,30);
        resposta.setBackground(new Color(255,190,180));
        



        JButton confirmar = new JButton("Confirmar");
        confirmar.setBounds(120,32,90,30);
        //confirmar.setContentAreaFilled(false);  // tira o fundo
        confirmar.setBorderPainted(false);      // tira a borda
        confirmar.setFocusPainted(false);       // tira a marquinha de foco

        Font fontejogo = new Font("Serif", Font.PLAIN, 15); 
            try {
                fontejogo = Font.createFont(Font.TRUETYPE_FONT, new File("agora.ttf")).deriveFont(17f);
               GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fontejogo);
            } catch (Exception e) {
                e.printStackTrace();
            }

        JLabel respostaFinal = new JLabel("");
            respostaFinal.setBounds(30, 90, 450, 60);
            respostaFinal.setFont(new Font("Serif", Font.ITALIC, 20));
            respostaFinal.setForeground(new Color(33,33,33));
            respostaFinal.setFont(fontejogo);

            confirmar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    try {
                        int valorDigitado = Integer.parseInt(resposta.getText());

                        if(valorDigitado == 0){
                            respostaFinal.setText("Credo num mim ama 😓");
                        }else if(valorDigitado ==69){
                            respostaFinal.setText("Hmm safadin😏");
                        }
                        else if(valorDigitado <=100){
                            respostaFinal.setText("Só issoo???");
                        }else if(valorDigitado <=1000){
                            respostaFinal.setText("Da pra dar mais neh😆");
                        }else if(valorDigitado <=5000){
                            respostaFinal.setText("Hmmm me ama, mas pouco 😌");
                        }else if(valorDigitado <= 10000){
                            respostaFinal.setText(
                               "<html>Uaaauu me amaa mesmo mas te amo  muito maaais<br>" 
                               
                                );
                        }else{
                            respostaFinal.setText(
                                "<html>Noossaaa vc mim amaa mesmo<br>"+
                                 " mas eu amo você infinitamente mais😍<br>"
                                 );
                        }
                    } catch (NumberFormatException ex) {
                        respostaFinal.setText("Nao adianta, Eu Te Amo mais😀");
                    }
                }
            });
        

        novaJanela.add(texto);
        novaJanela.add(resposta);
        novaJanela.add(confirmar);
        novaJanela.add(respostaFinal);
        
        
        

        novaJanela.setVisible(true);
    }
}
