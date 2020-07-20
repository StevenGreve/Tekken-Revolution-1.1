import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class Game 
{ 
	 public static void main(String[] args) 
	 {
	  	 new Game();	 
	 }
	 
     JFrame window;
     JPanel introImagePanel, titlePanel, startButtonPanel, lobbyPanel1, lobbyPanel2, lobbyPanel3, lobbyPanel4, lobbyPanel5, lobbyPanel6, lobbyPanel7, 
     lobbyPanel8, lobbyPanel9, creditPanel, returnPanel, forwardPanel, myNamePanel, meterPanel, rulesTextPanel, gallerySecretStagePanel,
     
     jinHealthBarPanel, azazelHealthBarPanel, bryanHealthBarPanel, kazuyaHealthBarPanel, heihachiHealthBarPanel, devilJinHealthBarPanel, ogreHealthBarPanel,
     azazelPanel, jinPanel, bryanPanel, kazuyaPanel, heihachiPanel, devilJinPanel, ogrePanel, liliHealthBarPanel, armorKingHealthBarPanel, liliPanel, armorKingPanel,
     heihachiNameDisplayPanel, kazuyaNameDisplayPanel, azazelNameDisplayPanel, jinNameDisplayPanel, bryanNameDisplayPanel, devilJinNameDisplayPanel, 
     ogreNameDisplayPanel, liliNameDisplayPanel, armorKingNameDisplayPanel, azazelGifPanel, jinGifPanel, bryanGifPanel, kazuyaGifPanel, heihachiGifPanel, 
     devilJinGifPanel, ogreGifPanel, liliGifPanel, armorKingGifPanel, attackAnimationPanel;     
     
     JButton startButton, mainMenuSecretStageButton, arcadeButton, rulesButton, creditsButton, quitButton, galleryButton, returnButton, forwardButton, jinIconButton, 
     devilJinIconButton, gallerySecretStageButton;
     JLabel introImageLabel, titleLabel, menuLabel, creditLabel, counterLabel, meterLabel, jinNameLabel, azazelNameLabel, bryanNameLabel, 
     kazuyaNameLabel, heihachiNameLabel, devilJinNameLabel, ogreNameLabel, liliNameLabel, armorKingNameLabel;
     JTextArea textArea, rulesTextArea;
     JProgressBar jinHealthBar, azazelHealthBar, bryanHealthBar, kazuyaHealthBar, heihachiHealthBar, 
     devilJinHealthBar, ogreHealthBar, liliHealthBar, armorKingHealthBar;
     
     Font titleFont = new Font("Monotype Corsiva", Font.PLAIN + Font.BOLD, 30);
     Font buttonFont = new Font("Calibri",Font.PLAIN + Font.ITALIC + Font.BOLD, 16);
     Font menuButtonFont = new Font("Calibri Light", Font.PLAIN + Font.ITALIC, 35); 
     Font lobbyFont = new Font("Calibri Light", Font.PLAIN + Font.ITALIC, 25); 
     Font timerFont = new Font("Arial", Font.PLAIN + Font.BOLD + Font.ITALIC, 60);
     Font nameDisplayFont = new Font ("Calibri", Font.PLAIN + Font.ITALIC + Font.BOLD, 15);
     Font meterFont = new Font("Book Antiqua", Font.ITALIC + Font.BOLD, 20);
     Font rulesFont = new Font("Book Antiqua", Font.ITALIC + Font.BOLD, 30);
     Font galleryFont = new Font("Monotype Corsiva", Font.ITALIC + Font.BOLD, 30);
     
     TitleScreenHandler titleScreenHandler = new TitleScreenHandler();
     ExitMenuHandler exitMenuHandler = new ExitMenuHandler();
     GalleryScreenHandler1 galleryScreenHandler1 = new GalleryScreenHandler1();
     GalleryScreenHandler2 galleryScreenHandler2 = new GalleryScreenHandler2();
     GalleryScreenHandler3 galleryScreenHandler3 = new GalleryScreenHandler3();
     GalleryScreenHandler4 galleryScreenHandler4 = new GalleryScreenHandler4();
     CreditScreenHandler creditScreenHandler = new CreditScreenHandler();
     ReturnBackHandler1 returnBackHandler1 = new ReturnBackHandler1();
     ReturnBackHandler2 returnBackHandler2 = new ReturnBackHandler2();
     ReturnBackHandler3 returnBackHandler3 = new ReturnBackHandler3();
     ReturnBackHandler4 returnBackHandler4 = new ReturnBackHandler4();
     ReturnBackHandler5 returnBackHandler5 = new ReturnBackHandler5();
     RulesScreenHandler rulesScreenHandler = new RulesScreenHandler();
     RulesScreenHandler2 rulesScreenHandler2 = new RulesScreenHandler2();
     HiddenStageHandler hiddenStageHandler = new HiddenStageHandler();
     HiddenStageHandler2 hiddenStageHandler2 = new HiddenStageHandler2();
     JinButtonHandler jinButtonHandler = new JinButtonHandler();
     JinButtonHandler2 jinButtonHandler2 = new JinButtonHandler2();
     DevilJinButtonHandler devilJinButtonHandler = new DevilJinButtonHandler();
     ArcadeScreenHandler1 arcadeScreenHandler1 = new ArcadeScreenHandler1();
     KeyHandler keyHandler = new KeyHandler();
     Controller controller = new Controller();
     Sound sound = new Sound(); 
     Music music = new Music();		     
     	  
     URL 
     //Announcer sounds
     playRound1_Sound = getClass().getResource("Round 1.wav"), playRound2_Sound = getClass().getResource("Round 2.wav"),
     playFinalRound_Sound = getClass().getResource("Final Round.wav"), playFight_Sound = getClass().getResource("Fight.wav"), 
     playKO_Sound = getClass().getResource("K.O.wav"), playGameOver_Sound = getClass().getResource("Game Over.wav"), 
     playYouWin_Sound = getClass().getResource("You Win.wav"), playYouLose_Sound = getClass().getResource("You Lose.wav"), 
    	 
     //Other sounds
     playHPSound = getClass().getResource("HP Sound.wav"), playMeterSound = getClass().getResource("Meter.wav"),         
     playIntroSound = getClass().getResource("Intro Sound.wav"), playLobbySound = getClass().getResource("Lobby Sound.wav"),
     playSecretStageSound = getClass().getResource("Secret Stage Sound.wav"), playReturnBackSound = getClass().getResource("Return Sound.wav"),
     	 
     //Music
     playIntroMusic = getClass().getResource("Intro Music.wav"), playLobbyMusic = getClass().getResource("Lobby Music.wav"),
     playCreditMusic = getClass().getResource("Credits Theme.wav"), playRulesMusic = getClass().getResource("Rules Music.wav"),
     playGalleryMusic_1= getClass().getResource("Gallery Frame 1 Music.wav"), playGalleryMusic_2 = getClass().getResource("Gallery Frame 2 Music.wav"),
     playGalleryMusic_3= getClass().getResource("Gallery Frame 3 Music.wav"), playGalleryMusic_4 = getClass().getResource("Gallery Frame 4 Music.wav"),
     playHiddenRetreatMusic = getClass().getResource("Hidden Retreat Music.wav"), playHiddenRetreat2Music = getClass().getResource("Hidden Retreat 2 Music.wav"),
     playArcadeStage1Music = getClass().getResource("Arcade Stage 1 Music.wav"), playArcadeStage2Music = getClass().getResource("Arcade Stage 2 Music.wav"),
     playArcadeStage3Music = getClass().getResource("Arcade Stage 3 Music.wav"),
     
     //Attack sounds
     playJinKazamaRageArt = getClass().getResource("Jin Kazama Rage Art.wav"),
     playHurricane_Sound = getClass().getResource("Ancient Hurricane.wav"),
     playMatterhorn_Sound = getClass().getResource("Matterhorn Ascension.wav");
 	
     ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("Game Icon.png"));
     
     //Timer variables
     String text;
     int i, second;
     
     private long lastPressProcessed = 0;
     
     boolean status1 = true;
     boolean status2 = false;
     boolean status3 = false;
     boolean status4 = false;
     boolean status5 = false;
     boolean thornWhip = false;
    
     public Game()
     {
    	window = new JFrame();
    	window.setLocationRelativeTo(null);
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.setTitle("Tekken Revolution");
    	window.setSize(768, 427);
    	window.setLocationRelativeTo(null);
    	window.setResizable(false);
    	window.setIconImage(icon.getImage());
    
    	//Intro gif
    	introImagePanel = new JPanel();
    	introImageLabel = new JLabel();
    	introImageLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Intro Background.gif")));
    	introImagePanel.add(introImageLabel);
    	window.setContentPane(introImageLabel);
    	
    	//Game title
    	titlePanel = new JPanel();
    	titlePanel.setBounds(100, 50, 550, 100);
    	titlePanel.setBackground(new Color(0,0,0,0));
    	window.add(titlePanel);
    	titleLabel = new JLabel("Tekken Revolution");
    	titleLabel.setForeground(new Color(222, 161, 47)); 
    	titlePanel.add(titleLabel);
    	titleLabel.setFont(titleFont);
    	
    	//"START MISSION" button
    	startButtonPanel = new JPanel();
    	startButtonPanel.setBounds(620, 360, 150, 100);
    	startButtonPanel.setBackground(Color.RED);
    	startButtonPanel.setOpaque(false);
    	window.add(startButtonPanel);
    
    	startButton = new JButton("START MISSION");
    	startButton.setForeground(new Color(222, 161, 47));   
    	startButton.setFont(buttonFont);
    	startButton.setBorder(null);
    	startButton.setBorderPainted(false);				
    	startButton.setContentAreaFilled(false);
    	startButton.setFocusPainted(false);
    	startButton.addActionListener(titleScreenHandler);  
    	startButtonPanel.add(startButton); 				       	
    	
    	music.setURL(playIntroMusic);
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);
    }
    
    public void createMenuScreen() 
    {
    	titlePanel.setVisible(false);
    	startButtonPanel.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Lobby Background.png"))));  
    	
    	//Main Menu button
    	lobbyPanel1 = new JPanel();
    	lobbyPanel1.setBounds(-20, 45, 245, 40);	
    	lobbyPanel1.setBackground(Color.RED);
    	lobbyPanel1.setOpaque(false);
    	window.add(lobbyPanel1);
    	
    	mainMenuSecretStageButton = new JButton("Main Menu");
    	mainMenuSecretStageButton.setForeground(Color.WHITE);
    	mainMenuSecretStageButton.setFont(menuButtonFont);
    	mainMenuSecretStageButton.setBorder(null);			
    	mainMenuSecretStageButton.setBorderPainted(false);			
    	mainMenuSecretStageButton.setContentAreaFilled(false);		
    	mainMenuSecretStageButton.setFocusPainted(false);			
    	mainMenuSecretStageButton.addActionListener(hiddenStageHandler);
    	lobbyPanel1.add(mainMenuSecretStageButton);
    	
    	//Arcade button
    	lobbyPanel2 = new JPanel();
    	lobbyPanel2.setBounds(-5, 100, 130, 30);
    	lobbyPanel2.setBackground(Color.GREEN);
    	lobbyPanel2.setOpaque(false);
    	window.add(lobbyPanel2);
    	
    	arcadeButton = new JButton("Arcade");
    	arcadeButton.setForeground(Color.WHITE);
    	arcadeButton.setFont(lobbyFont);
    	arcadeButton.setBorder(null);
    	arcadeButton.setBorderPainted(false);		
    	arcadeButton.setContentAreaFilled(false);	
    	arcadeButton.setFocusPainted(false);	
    	arcadeButton.addActionListener(arcadeScreenHandler1);
    	lobbyPanel2.add(arcadeButton);
    	
    	//Rules button
    	lobbyPanel3 = new JPanel();
    	lobbyPanel3.setBounds(-15, 140, 130, 30);
    	lobbyPanel3.setBackground(Color.ORANGE);
    	lobbyPanel3.setOpaque(false);
    	window.add(lobbyPanel3);
    	
    	rulesButton = new JButton("Rules");
    	rulesButton.setForeground(Color.WHITE);
    	rulesButton.setFont(lobbyFont);
    	rulesButton.setBorder(null);
    	rulesButton.setBorderPainted(false);
    	rulesButton.setContentAreaFilled(false);
    	rulesButton.setFocusPainted(false);
    	rulesButton.addActionListener(rulesScreenHandler);
    	lobbyPanel3.add(rulesButton);
    	
    	//Credits button
    	lobbyPanel4 = new JPanel();
    	lobbyPanel4.setBounds(-7, 180, 130, 30);
    	lobbyPanel4.setBackground(Color.GRAY);
    	lobbyPanel4.setOpaque(false);
    	window.add(lobbyPanel4);
    	
    	creditsButton = new JButton("Credits");
    	creditsButton.setForeground(Color.WHITE);
    	creditsButton.setFont(lobbyFont);
    	creditsButton.setBorder(null);
    	creditsButton.setBorderPainted(false);
    	creditsButton.setContentAreaFilled(false);
    	creditsButton.setFocusPainted(false);
    	creditsButton.addActionListener(creditScreenHandler);
    	lobbyPanel4.add(creditsButton);
    	
    	//Quit button
    	lobbyPanel5 = new JPanel();
    	lobbyPanel5.setBounds(-20, 220, 130, 40);
    	lobbyPanel5.setBackground(Color.CYAN);
    	lobbyPanel5.setOpaque(false);
    	window.add(lobbyPanel5);
    	
    	quitButton = new JButton("Quit");
    	quitButton.setForeground(Color.WHITE);
    	quitButton.setFont(lobbyFont);
    	quitButton.setBorder(null);
    	quitButton.setBorderPainted(false);
    	quitButton.setContentAreaFilled(false);
    	quitButton.setFocusPainted(false);
    	quitButton.addActionListener(exitMenuHandler);
    	lobbyPanel5.add(quitButton);
    	
    	//Gallery button
    	lobbyPanel6 = new JPanel();
    	lobbyPanel6.setBounds(-7, 260, 130, 40);
    	lobbyPanel6.setBackground(Color.MAGENTA);
    	lobbyPanel6.setOpaque(false);
    	window.add(lobbyPanel6);
    	
    	galleryButton = new JButton("Gallery");
    	galleryButton.setForeground(Color.WHITE);
    	galleryButton.setFont(lobbyFont);
    	galleryButton.setBorder(null);
    	galleryButton.setBorderPainted(false);
    	galleryButton.setContentAreaFilled(false);
    	galleryButton.setFocusPainted(false);
    	galleryButton.addActionListener(galleryScreenHandler1);
    	lobbyPanel6.add(galleryButton);
    	
    	//Blue menu bar
    	lobbyPanel7 = new JPanel();
    	lobbyPanel7.setBounds(0, 325, 755, 30);
    	lobbyPanel7.setBackground(new Color(1, 21, 54, 133));
    	window.add(lobbyPanel7);
    	
    	//Lobby music & sound
    	music.setURL(playLobbyMusic);							   
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);	
    }
    
    public void createCreditScreen() 
    {
    	lobbyPanel1.setVisible(false);
    	lobbyPanel2.setVisible(false);
    	lobbyPanel3.setVisible(false);
    	lobbyPanel4.setVisible(false);
    	lobbyPanel5.setVisible(false);
    	lobbyPanel6.setVisible(false);
    	lobbyPanel7.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Credits Background.gif")))); 
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont);
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler1);
    	returnPanel.add(returnButton);
 
    	JPanel myNamePanel = new JPanel();
    	myNamePanel.setBounds(18, 355, 250, 30);
    	myNamePanel.setBackground(Color.CYAN);
    	myNamePanel.setOpaque(false);
    	window.add(myNamePanel);
    	
    	textArea = new JTextArea();
    	textArea.setBounds(18, 355, 250, 30);
    	textArea.setBackground(new Color(0,0,0,0));
    	textArea.setForeground(new Color(218, 218, 218));
    	textArea.setFont(buttonFont);
    	textArea.setLineWrap(true);
    	textArea.setWrapStyleWord(true);
    	textArea.setOpaque(false);
    	myNamePanel.add(textArea);
    	
    	text = "CREATED BY STEVEN BRYAN GREVE";
    	timer.start();
    	
    	//Credits music & sound
    	music.setURL(playCreditMusic);							   
    	music.play();
    	music.loop();
    }
    
    public void createRulesScreen() 
    {
    	lobbyPanel1.setVisible(false);
    	lobbyPanel2.setVisible(false);
    	lobbyPanel3.setVisible(false);
    	lobbyPanel4.setVisible(false);
    	lobbyPanel5.setVisible(false);
    	lobbyPanel6.setVisible(false);
    	lobbyPanel7.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Rules Background.png")))); 
    	
    	rulesTextPanel = new JPanel();
    	rulesTextPanel.setBounds(52, 50, 650, 290);
    	rulesTextPanel.setOpaque(false);
    	window.add(rulesTextPanel);
    	
    	rulesTextArea = new JTextArea("This game works on a best-of-three rounds format.\n\n"
    			+ "Each character has its own unique set of attacks that are categorized \ninto three different tiers: low, mid and high. "
    			+ "Press the corresponding key to execute an attack, and use the right, left or up arrow to block \nincoming low, mid, or high attacks from "
    			+ "your opponent. \n\nIn case you block an attack successfully, a certain amount of damage \nwill be inflicted to your opponent’s HP.  "
    			+ "The full list of controls can be \nfound in the move list menu. ");
    	rulesTextArea.setBounds(52, 50, 650, 290);
    	rulesTextArea.setForeground(Color.WHITE);
    	rulesTextArea.setFont(meterFont);
    	rulesTextArea.setLineWrap(true);
    	rulesTextArea.setOpaque(false);
    	rulesTextPanel.add(rulesTextArea);
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont);
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler1);
    	returnPanel.add(returnButton);
    	
    	//Forward button
    	forwardPanel = new JPanel();
    	forwardPanel.setBounds(-90, 355, 250, 30);
    	forwardPanel.setBackground(Color.MAGENTA);
    	forwardPanel.setOpaque(false);
    	window.add(forwardPanel);
    	
    	forwardButton = new JButton("NEXT");
    	forwardButton.setForeground(new Color(218,218,218));
    	forwardButton.setBackground(Color.YELLOW);
    	forwardButton.setFont(buttonFont);
    	forwardButton.setBorder(null);
    	forwardButton.setBorderPainted(false);
    	forwardButton.setContentAreaFilled(false);
    	forwardButton.setFocusPainted(false);
    	forwardButton.addActionListener(rulesScreenHandler2);
    	forwardPanel.add(forwardButton);
    	
    	//Rules music 
    	music.setURL(playRulesMusic);							   
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);
    } 
    
    public void createRulesScreen2()
    {
    	rulesTextPanel.setVisible(false);
    	returnPanel.setVisible(false);
    	forwardPanel.setVisible(false);
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Rules Background 2.png"))));
    	
    	rulesTextPanel = new JPanel();
    	rulesTextPanel.setBounds(52, 50, 650, 290);
    	rulesTextPanel.setOpaque(false);
    	window.add(rulesTextPanel);
    	
    	rulesTextArea = new JTextArea("Jin Kazama: E, W, G, R, J, LEFT, UP and DOWN."
    			+ "\n\nKazuya Mishima: E, D, A, LEFT, UP and DOWN."
    			+ "\n\nDevil Jin: Y, X, C, S, V, B, LEFT, UP and DOWN."
    			+ "\n\nLili de Rochefort: A, E, T, S, F, LEFT, UP, and DOWN.");
    	rulesTextArea.setBounds(52, 50, 650, 290);
    	rulesTextArea.setForeground(Color.WHITE);
    	rulesTextArea.setFont(meterFont);
    	rulesTextArea.setLineWrap(true);
    	rulesTextArea.setOpaque(false);
    	rulesTextPanel.add(rulesTextArea);
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont);
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler5);
    	returnPanel.add(returnButton);
    }
    
    public void createGalleryScreen1() 
    {
    	lobbyPanel1.setVisible(false);
    	lobbyPanel2.setVisible(false);
    	lobbyPanel3.setVisible(false);
    	lobbyPanel4.setVisible(false);
    	lobbyPanel5.setVisible(false);
    	lobbyPanel6.setVisible(false);
    	lobbyPanel7.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Gallery Frame 1.gif"))));
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont);
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler1);
    	returnPanel.add(returnButton);
    	
    	//Forward button
    	forwardPanel = new JPanel();
    	forwardPanel.setBounds(-90, 355, 250, 30);
    	forwardPanel.setBackground(Color.MAGENTA);
    	forwardPanel.setOpaque(false);
    	window.add(forwardPanel);
    	
    	forwardButton = new JButton("NEXT");
    	forwardButton.setForeground(new Color(218,218,218));
    	forwardButton.setBackground(Color.YELLOW);
    	forwardButton.setFont(buttonFont);
    	forwardButton.setBorder(null);
    	forwardButton.setBorderPainted(false);
    	forwardButton.setContentAreaFilled(false);
    	forwardButton.setFocusPainted(false);
    	forwardButton.addActionListener(galleryScreenHandler2);
    	forwardPanel.add(forwardButton);
    	
    	//Gallery music 
    	music.setURL(playGalleryMusic_1);
    	music.play();
    	music.loop();	
    	
    	window.setVisible(true);
    }
    
    public void createGalleryScreen2()
    {
    	returnPanel.setVisible(false);
    	forwardPanel.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Gallery Frame 2.gif"))));
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont);
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler2);
    	returnPanel.add(returnButton);
    	
    	//Forward button
    	forwardPanel = new JPanel();
    	forwardPanel.setBounds(-90, 355, 250, 30);
    	forwardPanel.setBackground(Color.MAGENTA);
    	forwardPanel.setOpaque(false);
    	window.add(forwardPanel);
    	
    	forwardButton = new JButton("NEXT");
    	forwardButton.setForeground(new Color(218,218,218));
    	forwardButton.setBackground(Color.YELLOW);
    	forwardButton.setFont(buttonFont);
    	forwardButton.setBorder(null);
    	forwardButton.setBorderPainted(false);
    	forwardButton.setContentAreaFilled(false);
    	forwardButton.setFocusPainted(false);
    	forwardButton.addActionListener(galleryScreenHandler3);
    	forwardPanel.add(forwardButton);
    	
    	//Gallery Music 
    	music.setURL(playGalleryMusic_2);
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);
    }
    
    public void createGalleryScreen3()
    {
    	returnPanel.setVisible(false);
    	forwardPanel.setVisible(false);
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Gallery Frame 3.gif"))));
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont);
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler3);
    	returnPanel.add(returnButton);
    	
    	//Forward button
    	forwardPanel = new JPanel();
    	forwardPanel.setBounds(-90, 355, 250, 30);
    	forwardPanel.setBackground(Color.MAGENTA);
    	forwardPanel.setOpaque(false);
    	window.add(forwardPanel);
    	
    	forwardButton = new JButton("NEXT");
    	forwardButton.setForeground(new Color(218,218,218));
    	forwardButton.setBackground(Color.YELLOW);
    	forwardButton.setFont(buttonFont);
    	forwardButton.setBorder(null);
    	forwardButton.setBorderPainted(false);
    	forwardButton.setContentAreaFilled(false);
    	forwardButton.setFocusPainted(false);
    	forwardButton.addActionListener(galleryScreenHandler4);
    	forwardPanel.add(forwardButton);
    	
    	//Gallery Music
    	music.setURL(playGalleryMusic_3);
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);
    }
    
    public void createGalleryScreen4()
    {
    	returnPanel.setVisible(false);
    	forwardPanel.setVisible(false);  	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Gallery Frame 4.gif"))));
    	
    	//Return button
    	returnPanel = new JPanel();
    	returnPanel.setBounds(670, 355, 100, 40);
    	returnPanel.setBackground(Color.MAGENTA);
    	returnPanel.setOpaque(false);
    	window.add(returnPanel);
    	
    	returnButton = new JButton("BACK");
    	returnButton.setForeground(new Color(218,218,218));
    	returnButton.setFont(buttonFont); 
    	returnButton.setBorder(null);
    	returnButton.setBorderPainted(false);
    	returnButton.setContentAreaFilled(false);
    	returnButton.setFocusPainted(false);
    	returnButton.addActionListener(returnBackHandler4);
    	returnPanel.add(returnButton);
    	
    	//Hidden Stage 2 -  Button 
    	gallerySecretStagePanel = new JPanel();
    	gallerySecretStagePanel.setBounds(82, 335, 120, 42);
    	gallerySecretStagePanel.setBackground(new Color(1, 21, 54, 250));	
    	window.add(gallerySecretStagePanel);
    	
    	gallerySecretStageButton = new JButton("SBG");
    	gallerySecretStageButton.setForeground(Color.WHITE);
    	gallerySecretStageButton.setFont(galleryFont); 
    	gallerySecretStageButton.setBorder(null);
    	gallerySecretStageButton.setBorderPainted(false);
    	gallerySecretStageButton.setContentAreaFilled(false);
    	gallerySecretStageButton.setFocusPainted(false);
    	gallerySecretStageButton.addActionListener(hiddenStageHandler2);
    	gallerySecretStagePanel.add(gallerySecretStageButton);
    	
    	//Gallery Music
    	music.setURL(playGalleryMusic_4);
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);
    }
    
    public void createHiddenStage() 
    {
    	lobbyPanel1.setVisible(false);
    	lobbyPanel2.setVisible(false);
    	lobbyPanel3.setVisible(false);
    	lobbyPanel4.setVisible(false);
    	lobbyPanel5.setVisible(false);
    	lobbyPanel6.setVisible(false);
    	lobbyPanel7.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Hidden Stage 1.jpg"))));
    	
    	//Jin's health bar
    	jinHealthBarPanel = new JPanel();
    	jinHealthBarPanel.setBounds(80, 23, 250, 30);
    	jinHealthBarPanel.setBackground(Color.BLUE);
    	jinHealthBarPanel.setOpaque(false);
    	window.add(jinHealthBarPanel);
    	
    	jinHealthBar = new JProgressBar(0, 170);
    	jinHealthBar.setPreferredSize(new Dimension(250, 30));
    	jinHealthBar.setBackground(Color.RED);
    	jinHealthBar.setForeground(Color.GREEN);
    	jinHealthBar.setBorder(null);
    	jinHealthBar.setValue(controller.jinKazama.getHP());
    	jinHealthBarPanel.add(jinHealthBar);
    	
    	//Jin HP bar icon
    	jinPanel = new JPanel();
    	jinPanel.setBounds(15, 10, 60, 60);
    	jinPanel.setBackground(Color.BLUE);
    	jinPanel.setOpaque(false);
    	window.add(jinPanel);
    	
    	jinIconButton = new JButton();
    	jinIconButton.setIcon(new ImageIcon(this.getClass().getResource("Jin Icon 01.png")));
    	jinIconButton.setBorder(null);
    	jinIconButton.setBorderPainted(false);
    	jinIconButton.setContentAreaFilled(false);
    	jinIconButton.setFocusPainted(false);
    	jinIconButton.addActionListener(jinButtonHandler);
    	jinPanel.add(jinIconButton);
    	
    	//Jin HP bar name display
    	jinNameDisplayPanel = new JPanel();
    	jinNameDisplayPanel.setBounds(65, 50, 100, 20);
    	jinNameDisplayPanel.setBackground(Color.CYAN);
    	jinNameDisplayPanel.setOpaque(false);
    	window.add(jinNameDisplayPanel);
    	
    	jinNameLabel = new JLabel("Jin Kazama");
    	jinNameLabel.setBounds(65, 50, 100, 20);
    	jinNameLabel.setForeground(Color.WHITE);
    	jinNameLabel.setFont(nameDisplayFont);
    	jinNameDisplayPanel.add(jinNameLabel);
    	
    	//Jin character (gif) display
    	jinGifPanel = new JPanel();
    	jinGifPanel.setBounds(125, 210, 135, 135);
    	jinGifPanel.setBackground(Color.BLACK);
    	jinGifPanel.setOpaque(false);
    	window.add(jinGifPanel);
    	
    	jinGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Jin Kazama 01.gif"))));
    	
    	//Azazel's health bar
    	azazelHealthBarPanel = new JPanel();
    	azazelHealthBarPanel.setBounds(425, 23, 250, 30);
    	azazelHealthBarPanel.setBackground(Color.BLUE);
    	azazelHealthBarPanel.setOpaque(false);
    	window.add(azazelHealthBarPanel);
    	
    	azazelHealthBar = new JProgressBar(0, 300);
    	azazelHealthBar.setPreferredSize(new Dimension(250, 30));
    	azazelHealthBar.setBackground(Color.RED);
    	azazelHealthBar.setForeground(Color.GREEN);
    	azazelHealthBar.setBorder(null);
    	azazelHealthBar.setValue(controller.azazel.getHP());
    	azazelHealthBarPanel.add(azazelHealthBar);
    	
    	//Azazel HP bar icon
    	azazelPanel = new JPanel();
    	azazelPanel.setBounds(680, 10, 60, 60);
    	azazelPanel.setBackground(Color.BLUE);
    	azazelPanel.setOpaque(false);
    	window.add(azazelPanel);
    	
    	azazelPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Azazel Icon.png")))); //Adding picture directly to JPanel
    	
    	//Azazel HP bar name display 
    	azazelNameDisplayPanel = new JPanel();
    	azazelNameDisplayPanel.setBounds(600, 50, 100, 20); 
    	azazelNameDisplayPanel.setBackground(Color.CYAN);
    	azazelNameDisplayPanel.setOpaque(false);
    	window.add(azazelNameDisplayPanel);
    	
    	azazelNameLabel = new JLabel("Azazel");
    	azazelNameLabel.setBounds(65, 50, 100, 20);
    	azazelNameLabel.setForeground(Color.WHITE);
    	azazelNameLabel.setFont(nameDisplayFont);
    	azazelNameDisplayPanel.add(azazelNameLabel);
    	
    	//Azazel character (gif) display
    	azazelGifPanel = new JPanel();
    	azazelGifPanel.setBounds(350, 50, 380, 350);
    	azazelGifPanel.setBackground(Color.BLACK);
    	azazelGifPanel.setOpaque(false);
    	window.add(azazelGifPanel);
    	
    	azazelGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Azazel 01.gif"))));
 
        //Meter display
        meterLabel = new JLabel("Meter: ");
        meterLabel.setBounds(15, 300, 140, 150);
        meterLabel.setForeground(Color.WHITE);
        meterLabel.setFont(meterFont);
        window.add(meterLabel);
        
    	//Round timer (30 seconds)
    	counterLabel = new JLabel();
    	counterLabel.setBounds(300, -35, 150, 150);
    	counterLabel.setForeground(new Color(230, 230, 230)); 
    	counterLabel.setHorizontalAlignment(JLabel.CENTER);
    	counterLabel.setFont(timerFont);
    	window.add(counterLabel);
    	
    	//Hidden Stage Setup
    	second = 31;
    	countdownTimer();
    	timer3.start();
    	controller.characterAttackSetup();
    	window.addKeyListener(keyHandler);
    	window.setFocusable(true);
    	window.requestFocus();
    	status1 = true;
    	
    	//Safe reset
    	controller.azazel.restoreHP();
		controller.jinKazama.restoreHP();
		jinHealthBar.setValue(controller.jinKazama.getHP());
    	azazelHealthBar.setValue(controller.azazel.getHP());
    	
    	//Music
    	music.setURL(playHiddenRetreatMusic);							   
    	music.play();
    	music.loop();
    }
    
    public class KeyHandler implements KeyListener
    {
    	@Override
    	public void keyPressed(KeyEvent e) 
    	{
    		if(status1 == true)
    		{
    		switch(e.getKeyCode()) 
    		{
    		case KeyEvent.VK_E:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
        		{
    				controller.triggerAttackAction(KeyEvent.VK_E, controller.jinKazama, controller.azazel, azazelHealthBar);
    				ses.schedule(azazelTask1, 2, TimeUnit.SECONDS);
    				lastPressProcessed = System.currentTimeMillis();
    				break;        
        	     }  
    		    
    		case KeyEvent.VK_W:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{
    				controller.triggerAttackAction(KeyEvent.VK_W, controller.jinKazama, controller.azazel, azazelHealthBar);
    				ses.schedule(azazelTask2, 2, TimeUnit.SECONDS);
    				lastPressProcessed = System.currentTimeMillis();
    				break;
    			}
    		case KeyEvent.VK_R:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{
    				while(controller.lowRoundhouseCounter == 0)
    				{
    					controller.triggerAttackAction(KeyEvent.VK_R, controller.jinKazama, controller.azazel, azazelHealthBar);
    					controller.lowRoundhouseCounter++;
    					lastPressProcessed = System.currentTimeMillis();
    				}
    				break;
    			}
    		case KeyEvent.VK_G:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{
    				controller.triggerAttackAction(KeyEvent.VK_G, controller.jinKazama, controller.azazel, azazelHealthBar);
    				ses.schedule(azazelTask3, 2, TimeUnit.SECONDS);
    				lastPressProcessed = System.currentTimeMillis();
    				break;
    			}
    		case KeyEvent.VK_J:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{
    				if(!(controller.jinKazama.getHP() <= 50) && timer3.isRunning())
    				{
    					sound.setURL(controller.jinKazama.getAttacks().get(7).getSoundFile());
						sound.play();
						controller.jinKazama.inflictDamage(controller.jinKazama.getAttacks().get(7).getDamage());
						jinHealthBar.setValue(controller.jinKazama.getHP());
    				}
    				else if(timer3.isRunning() && controller.jinKazama.getHP() <= 50 && controller.jinRageLimit == 0)
    				{
    					attackAnimationPanel = new JPanel();
    					attackAnimationPanel.setBounds(350, 50, 380, 350);
    					attackAnimationPanel.setBackground(new Color(0,0,0,0));
    					attackAnimationPanel.setOpaque(false);
    			    	window.add(attackAnimationPanel);
    			    	attackAnimationPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Jin Rage Art.gif"))));
    					controller.triggerAttackAction(KeyEvent.VK_J, controller.jinKazama, controller.azazel, azazelHealthBar);
    					ses.schedule(attackAnimation, 7, TimeUnit.SECONDS);
    					controller.lowRoundhouseCounter = 0;
	    				controller.jinRageLimit++;
    				}
    				lastPressProcessed = System.currentTimeMillis();
    				break;
    			}
    		case KeyEvent.VK_DOWN:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{ 
    				Attack azazelAttack = controller.azazel.getRandomAttack();
    				if (azazelAttack.getAttackType() == AttackType.LOW) 
    				{		
    					controller.triggerAttackAction(KeyEvent.VK_G, controller.jinKazama, controller.azazel, azazelHealthBar);
						
						if(controller.meter < 3)
    					{
    						sound.setURL(playMeterSound);
        					sound.play();
        					controller.meter++;
        					meterLabel.setText("Meter: " + controller.meter);
    					}

    					if(controller.meter == 3 && controller.meterLimit == 0) 
    					{
    						controller.triggerAttackAction(KeyEvent.VK_E, controller.jinKazama, controller.azazel, azazelHealthBar);
    						controller.lowRoundhouseCounter = 0;
    						controller.meterLimit++;
    					}
    				}
    				if(azazelAttack.getAttackType() != AttackType.LOW)
    				{
    					controller.jinKazama.inflictDamage(controller.azazel.getAttacks().get(1).getDamage());
    					sound.setURL(controller.azazel.getAttacks().get(1).getSoundFile());
    					sound.play();
    					jinHealthBar.setValue(controller.jinKazama.getHP());
    				}
    				lastPressProcessed = System.currentTimeMillis();
    				break;
    			}
    		case KeyEvent.VK_LEFT:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{
    				Attack azazelAttack = controller.azazel.getRandomAttack();
					if (azazelAttack.getAttackType() == AttackType.MID) 
					{
						controller.triggerAttackAction(KeyEvent.VK_G, controller.jinKazama, controller.azazel, azazelHealthBar);
						
						if(controller.meter < 3)
						{
							sound.setURL(playMeterSound);
    						sound.play();
    						controller.meter++;
							meterLabel.setText("Meter: " + controller.meter);
						}
						
						if(controller.meter == 3 && controller.meterLimit == 0)
						{
							sound.setURL(controller.jinKazama.getAttacks().get(4).getSoundFile());
							sound.play();
							controller.azazel.inflictDamage(controller.jinKazama.getAttacks().get(4).getDamage());
							azazelHealthBar.setValue(controller.azazel.getHP());
							controller.lowRoundhouseCounter = 0;
							controller.meterLimit++;
						}
					}
					
					if(azazelAttack.getAttackType() != AttackType.MID)
					{
						controller.performRandomAttack(controller.jinKazama, controller.azazel);
						jinHealthBar.setValue(controller.jinKazama.getHP());
					}
    				lastPressProcessed = System.currentTimeMillis();
    				break;
    			}
    		case KeyEvent.VK_UP:
    			if(System.currentTimeMillis() - lastPressProcessed > 2100)
    			{
    				Attack azazelAttack = controller.azazel.getRandomAttack();
					if (azazelAttack.getAttackType() == AttackType.HIGH) 
					{
						sound.setURL(controller.jinKazama.getAttacks().get(4).getSoundFile());
						sound.play();
						controller.azazel.inflictDamage(controller.jinKazama.getAttacks().get(4).getDamage());
						azazelHealthBar.setValue(controller.azazel.getHP());
						
						if(controller.meter < 3)
						{
							sound.setURL(playMeterSound);
    						sound.play();
    						controller.meter++;
							meterLabel.setText("Meter: " + controller.meter);
						}
						if(controller.meter == 3 && controller.meterLimit == 0)
						{
							sound.setURL(controller.jinKazama.getAttacks().get(5).getSoundFile());
							sound.play();
							controller.azazel.inflictDamage(controller.jinKazama.getAttacks().get(5).getDamage());
							azazelHealthBar.setValue(controller.azazel.getHP());
							controller.lowRoundhouseCounter = 0;
							controller.meterLimit++;
						}
					}
					if(azazelAttack.getAttackType() != AttackType.HIGH)
					{
						sound.setURL(controller.azazel.getAttacks().get(0).getSoundFile());
						sound.play();
						controller.jinKazama.inflictDamage(controller.azazel.getAttacks().get(0).getDamage());
						jinHealthBar.setValue(controller.jinKazama.getHP());
					}
					lastPressProcessed = System.currentTimeMillis();
    				break;
    			}
    		}
    	}
    		else if(status2 == true || arcadeButton.getModel().isPressed())
    		{
    			switch(e.getKeyCode()) 
        		{
        		case KeyEvent.VK_E:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				controller.triggerAttackAction(KeyEvent.VK_E, controller.jinKazama, controller.bryanFury, bryanHealthBar);
        				ses.schedule(bryanTask1, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break; 
            	     }
        		case KeyEvent.VK_W:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				controller.triggerAttackAction(KeyEvent.VK_W, controller.jinKazama, controller.bryanFury, bryanHealthBar);
        				ses.schedule(bryanTask2, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}
        		case KeyEvent.VK_R:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				while(controller.lowRoundhouseCounter == 0)
        				{
        					controller.triggerAttackAction(KeyEvent.VK_R, controller.jinKazama, controller.bryanFury, bryanHealthBar);
        					controller.lowRoundhouseCounter++;
        					lastPressProcessed = System.currentTimeMillis();
        				}
        				break;
        			}
        		case KeyEvent.VK_G:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				controller.triggerAttackAction(KeyEvent.VK_G, controller.jinKazama, controller.bryanFury, bryanHealthBar);
        				ses.schedule(bryanTask3, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}
        		case KeyEvent.VK_J:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				if(!(controller.jinKazama.getHP() <= 50) && timer4.isRunning())
        				{
        					sound.setURL(controller.jinKazama.getAttacks().get(7).getSoundFile());
    						sound.play();
    						controller.jinKazama.inflictDamage(controller.jinKazama.getAttacks().get(7).getDamage());
    						jinHealthBar.setValue(controller.jinKazama.getHP());
        				}
        				else if(timer4.isRunning() && controller.jinKazama.getHP() <= 50 && controller.jinRageLimit == 0)
        				{
        					attackAnimationPanel = new JPanel();
        					attackAnimationPanel.setBounds(350, 50, 380, 350);
        					attackAnimationPanel.setBackground(Color.YELLOW);
        					attackAnimationPanel.setOpaque(false);
        			    	window.add(attackAnimationPanel);
        			    	attackAnimationPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Jin Rage Art.gif"))));
        					controller.triggerAttackAction(KeyEvent.VK_J, controller.jinKazama, controller.bryanFury, bryanHealthBar);
        					ses.schedule(attackAnimation, 7, TimeUnit.SECONDS);
        					controller.lowRoundhouseCounter = 0;
    	    				controller.jinRageLimit++;
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}	
        		case KeyEvent.VK_DOWN:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{ 
        				Attack bryanAttack = controller.bryanFury.getRandomAttack();
        				if (bryanAttack.getAttackType() == AttackType.LOW) 
        				{		
        					sound.setURL(controller.jinKazama.getAttacks().get(4).getSoundFile());
    						sound.play();
    						controller.bryanFury.inflictDamage(controller.jinKazama.getAttacks().get(4).getDamage());
    						bryanHealthBar.setValue(controller.bryanFury.getHP());
        				}
        				if(bryanAttack.getAttackType() != AttackType.LOW)
        				{
        					controller.jinKazama.inflictDamage(controller.bryanFury.getAttacks().get(0).getDamage());
        					sound.setURL(controller.bryanFury.getAttacks().get(0).getSoundFile());
        					sound.play();
        					jinHealthBar.setValue(controller.jinKazama.getHP());
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;	
        			}
        		case KeyEvent.VK_LEFT:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				sound.setURL(controller.jinKazama.getAttacks().get(7).getSoundFile());
						sound.play();
						controller.jinKazama.inflictDamage(controller.jinKazama.getAttacks().get(7).getDamage());
						jinHealthBar.setValue(controller.jinKazama.getHP());
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_UP:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack bryanAttack = controller.bryanFury.getRandomAttack();
        				if (bryanAttack.getAttackType() == AttackType.HIGH) 
        				{		
        					controller.triggerAttackAction(KeyEvent.VK_G, controller.jinKazama, controller.bryanFury, bryanHealthBar);
        				}
        				
        				if(bryanAttack.getAttackType() != AttackType.HIGH)
        				{
        					ses.schedule(bryanTask3, 0, TimeUnit.SECONDS);
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		}
    		}
    		else if(status3 == true)
			{
				switch(e.getKeyCode()) 
        		{
        		case KeyEvent.VK_E:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				controller.heihachiMishima.inflictDamage(controller.kazuyaMishima.getAttacks().get(0).getDamage());
    					sound.setURL(controller.kazuyaMishima.getAttacks().get(0).getSoundFile());
    					sound.play();
    					heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    					ses.schedule(heihachiTask1, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break; 
            	    }
        		case KeyEvent.VK_D:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				while(controller.spinnningDemonCounter == 0)
        				{
        					controller.heihachiMishima.inflictDamage(controller.kazuyaMishima.getAttacks().get(2).getDamage());
        					sound.setURL(controller.kazuyaMishima.getAttacks().get(2).getSoundFile());
        					sound.play();
        					heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
        					controller.spinnningDemonCounter++;
        					lastPressProcessed = System.currentTimeMillis();
        				}
        				break;
        			}
        		case KeyEvent.VK_A:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				while(controller.abolishingFistCounter == 0)
        				{
        					controller.heihachiMishima.inflictDamage(controller.kazuyaMishima.getAttacks().get(1).getDamage());
        					sound.setURL(controller.kazuyaMishima.getAttacks().get(1).getSoundFile());
        					sound.play();
        					heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
        					controller.abolishingFistCounter++;
        					lastPressProcessed = System.currentTimeMillis();
        				}
        				break;
        			}
        		case KeyEvent.VK_UP:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack heihachiMishimaAttack = controller.heihachiMishima.getRandomAttack();
        				if (heihachiMishimaAttack.getAttackType() == AttackType.HIGH) 
        				{		
        					controller.heihachiMishima.inflictDamage(controller.kazuyaMishima.getAttacks().get(5).getDamage());
        					sound.setURL(controller.kazuyaMishima.getAttacks().get(5).getSoundFile());
        					sound.play();
        					heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
        				}
        				controller.abolishingFistCounter = 0;
        				
        				if(heihachiMishimaAttack.getAttackType() != AttackType.HIGH)
        				{
        					controller.kazuyaMishima.inflictDamage(controller.heihachiMishima.getAttacks().get(1).getDamage());
        			    	sound.setURL(controller.heihachiMishima.getAttacks().get(1).getSoundFile());
        			    	sound.play();
        			    	kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_LEFT:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack heihachiMishimaAttack = controller.heihachiMishima.getRandomAttack();
        				if (heihachiMishimaAttack.getAttackType() == AttackType.MID) 
        				{		
        					controller.heihachiMishima.inflictDamage(controller.kazuyaMishima.getAttacks().get(3).getDamage());
        					sound.setURL(controller.kazuyaMishima.getAttacks().get(3).getSoundFile());
        					sound.play();
        					heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
        				}
        				
        				if(heihachiMishimaAttack.getAttackType() != AttackType.MID)
        				{
        					controller.kazuyaMishima.inflictDamage(controller.heihachiMishima.getAttacks().get(0).getDamage());
        			    	sound.setURL(controller.heihachiMishima.getAttacks().get(0).getSoundFile());
        			    	sound.play();
        			    	kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_DOWN:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack heihachiMishimaAttack = controller.heihachiMishima.getRandomAttack();
        				if (heihachiMishimaAttack.getAttackType() == AttackType.LOW) 
        				{		
        					controller.heihachiMishima.inflictDamage(controller.kazuyaMishima.getAttacks().get(4).getDamage());
        					sound.setURL(controller.kazuyaMishima.getAttacks().get(4).getSoundFile());
        					sound.play();
        					heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
        				}
        				controller.spinnningDemonCounter = 0;
        				
        				if(heihachiMishimaAttack.getAttackType() != AttackType.LOW)
        				{
        					controller.kazuyaMishima.inflictDamage(controller.heihachiMishima.getAttacks().get(2).getDamage());
        			    	sound.setURL(controller.heihachiMishima.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        			    	kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		}
			}
    		else if(status4 == true)
			{
				switch(e.getKeyCode()) 
        		{
        		case KeyEvent.VK_Y:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				while(controller.wraithKickCounter == 0)
        				{
        					controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(0).getDamage());
        			    	ogreHealthBar.setValue(controller.ogre.getHP());
        			    	sound.setURL(controller.devilJin.getAttacks().get(0).getSoundFile());
        			    	sound.play();
        					controller.wraithKickCounter++;
        					lastPressProcessed = System.currentTimeMillis();
        				}
        				break; 
            	    }
        		case KeyEvent.VK_X:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(1).getDamage());
    			    	ogreHealthBar.setValue(controller.ogre.getHP());
    			    	sound.setURL(controller.devilJin.getAttacks().get(1).getSoundFile());
    			    	sound.play();
        				ses.schedule(ogreTask1, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break; 
            	    }
        		case KeyEvent.VK_C:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(2).getDamage());
    			    	ogreHealthBar.setValue(controller.ogre.getHP());
    			    	sound.setURL(controller.devilJin.getAttacks().get(2).getSoundFile());
    			    	sound.play();
        				ses.schedule(ogreTask2, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break; 
            	    }
        		case KeyEvent.VK_S:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				Attack ogreAttack = controller.ogre.getRandomAttack();
        				if (ogreAttack.getAttackType() == AttackType.LOW || ogreAttack.getAttackType() == AttackType.MID) 
        				{		
        					controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(3).getDamage());
        			    	ogreHealthBar.setValue(controller.ogre.getHP());
        			    	sound.setURL(controller.devilJin.getAttacks().get(3).getSoundFile());
        			    	sound.play();
        			    	controller.wraithKickCounter = 0;
        				}
        				if(ogreAttack.getAttackType() == AttackType.HIGH)
        				{
        					controller.devilJin.inflictDamage(controller.ogre.getAttacks().get(1).getDamage());
        			    	devilJinHealthBar.setValue(controller.devilJin.getHP());
        			    	sound.setURL(playHurricane_Sound);
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
            	    }
        		case KeyEvent.VK_V:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				if(!(controller.devilJin.getHP() <= 50) && timer6.isRunning())
        				{	
        					controller.devilJin.inflictDamage(controller.devilJin.getAttacks().get(7).getDamage());
            			    devilJinHealthBar.setValue(controller.devilJin.getHP());
            			    sound.setURL(controller.devilJin.getAttacks().get(7).getSoundFile());
            			    sound.play();
        					
        				}
        				else if(timer6.isRunning() && controller.devilJin.getHP() <= 50 && controller.devilJinRageLimit == 0)
        				{
        					attackAnimationPanel = new JPanel();
        					attackAnimationPanel.setBounds(350, 50, 380, 350);
        					attackAnimationPanel.setBackground(Color.YELLOW);
        					attackAnimationPanel.setOpaque(false);
        			    	window.add(attackAnimationPanel);
        			    	attackAnimationPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Devil Jin Rage Art.gif"))));
        			    	controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(4).getDamage());
        			    	sound.setURL(controller.devilJin.getAttacks().get(4).getSoundFile());
        			    	ogreHealthBar.setValue(controller.ogre.getHP());
        			    	sound.play();
        					ses.schedule(attackAnimation, 5, TimeUnit.SECONDS);
        					controller.wraithKickCounter = 0;
    	    				controller.devilJinRageLimit++;
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}
        		case KeyEvent.VK_B:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				if(controller.meter == 3 && controller.meterLimit == 0)
						{
							controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(5).getDamage());
							ogreHealthBar.setValue(controller.ogre.getHP());
							sound.setURL(controller.devilJin.getAttacks().get(5).getSoundFile());
							sound.play();
							controller.meterLimit++;
							controller.wraithKickCounter = 0;
						}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}	
        		case KeyEvent.VK_UP:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack ogreAttack = controller.ogre.getRandomAttack();
        				if (ogreAttack.getAttackType() == AttackType.HIGH) 
        				{		
        					controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(6).getDamage());
        					ogreHealthBar.setValue(controller.ogre.getHP());
        					sound.setURL(controller.devilJin.getAttacks().get(6).getSoundFile());
        					sound.play();
        					controller.wraithKickCounter = 0;
        					
        					if(controller.meter < 3)
        					{
        						sound.setURL(playMeterSound);
            					sound.play();
            					controller.meter++;
            					meterLabel.setText("Meter: " + controller.meter);
        					}
        				}
        				
        				if(ogreAttack.getAttackType() != AttackType.HIGH)
        				{
        					controller.devilJin.inflictDamage(controller.ogre.getAttacks().get(1).getDamage());
        			    	devilJinHealthBar.setValue(controller.devilJin.getHP());
        			    	sound.setURL(controller.ogre.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_LEFT:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack ogreAttack = controller.ogre.getRandomAttack();
        				if (ogreAttack.getAttackType() == AttackType.MID) 
        				{		
        					controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(2).getDamage());
        					ogreHealthBar.setValue(controller.ogre.getHP());
        					sound.setURL(controller.devilJin.getAttacks().get(2).getSoundFile());
        					sound.play();
        					controller.wraithKickCounter = 0;
        					
        					if(controller.meter < 3)
        					{
        						sound.setURL(playMeterSound);
            					sound.play();
            					controller.meter++;
            					meterLabel.setText("Meter: " + controller.meter);
        					}
        				}
        				
        				if(ogreAttack.getAttackType() != AttackType.MID)
        				{
        					controller.devilJin.inflictDamage(controller.ogre.getAttacks().get(2).getDamage());
        			    	devilJinHealthBar.setValue(controller.devilJin.getHP());
        			    	sound.setURL(controller.ogre.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_DOWN:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack ogreAttack = controller.ogre.getRandomAttack();
        				if (ogreAttack.getAttackType() == AttackType.LOW) 
        				{		
        					controller.ogre.inflictDamage(controller.devilJin.getAttacks().get(3).getDamage());
        					ogreHealthBar.setValue(controller.ogre.getHP());
        					sound.setURL(controller.devilJin.getAttacks().get(3).getSoundFile());
        					sound.play();
        					controller.wraithKickCounter = 0;
        					
        					if(controller.meter < 3)
        					{
        						sound.setURL(playMeterSound);
            					sound.play();
            					controller.meter++;
            					meterLabel.setText("Meter: " + controller.meter);
        					}
        				}
        				
        				if(ogreAttack.getAttackType() != AttackType.LOW)
        				{
        					controller.devilJin.inflictDamage(controller.ogre.getAttacks().get(2).getDamage());
        			    	devilJinHealthBar.setValue(controller.devilJin.getHP());
        			    	sound.setURL(controller.ogre.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		}
			}
    		else if(status5 == true || gallerySecretStageButton.getModel().isPressed())
    		{
    			switch(e.getKeyCode()) 
        		{
        		case KeyEvent.VK_A:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100) 
            		{
        				if(System.currentTimeMillis() - lastPressProcessed > 2100)
            			{
            				controller.armorKing.inflictDamage(controller.lili.getAttacks().get(0).getDamage());
            				armorKingHealthBar.setValue(controller.armorKing.getHP());
            				sound.setURL(controller.lili.getAttacks().get(1).getSoundFile());
            				sound.play();
            				ses.schedule(armorKingTask1, 2, TimeUnit.SECONDS);
            				lastPressProcessed = System.currentTimeMillis();
            				break;
            			}
            	    }
        		case KeyEvent.VK_E:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				while(controller.edelweissCounter == 0)
    					{
    						controller.armorKing.inflictDamage(controller.lili.getAttacks().get(1).getDamage());
    						sound.setURL(controller.lili.getAttacks().get(1).getSoundFile());
    						sound.play();
    						armorKingHealthBar.setValue(controller.armorKing.getHP());
    						controller.edelweissCounter++;
    						thornWhip = true;
    						lastPressProcessed = System.currentTimeMillis();
    					}
    					break;
        			}
        		case KeyEvent.VK_T:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				while(thornWhip == true && controller.thornWhipCounter == 0)
        				{
        					controller.armorKing.inflictDamage(controller.lili.getAttacks().get(4).getDamage());
        					sound.setURL(controller.lili.getAttacks().get(4).getSoundFile());
        					sound.play();
        					armorKingHealthBar.setValue(controller.armorKing.getHP());
        					controller.thornWhipCounter++;
        					thornWhip = false;		
        				}
        				break;
        			}
        			
        		case KeyEvent.VK_S:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				controller.armorKing.inflictDamage(controller.lili.getAttacks().get(3).getDamage());
        				armorKingHealthBar.setValue(controller.armorKing.getHP());
        				sound.setURL(controller.lili.getAttacks().get(3).getSoundFile());
        				sound.play();
        				ses.schedule(armorKingTask2, 2, TimeUnit.SECONDS);
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}
        		case KeyEvent.VK_F:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				if(!(controller.lili.getHP() <= 25) && timer7.isRunning())
        				{	
        					controller.lili.inflictDamage(controller.lili.getAttacks().get(6).getDamage());
            			    liliHealthBar.setValue(controller.lili.getHP());
            			    sound.setURL(controller.lili.getAttacks().get(6).getSoundFile());
            			    sound.play();
        					
        				}
        				else if(timer7.isRunning() && controller.lili.getHP() <= 25 && controller.liliRageLimit == 0)
        				{
        			    	controller.armorKing.inflictDamage(controller.lili.getAttacks().get(5).getDamage());
        			    	armorKingHealthBar.setValue(controller.armorKing.getHP());
        			    	sound.setURL(controller.lili.getAttacks().get(5).getSoundFile());
        			    	sound.play();
    	    				controller.liliRageLimit++;
        				}
        				controller.edelweissCounter = 0;
        				controller.thornWhipCounter = 0;
        				lastPressProcessed = System.currentTimeMillis();
        				break;
        			}
        		case KeyEvent.VK_UP:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack armorKingAttack = controller.armorKing.getRandomAttack();
        				if (armorKingAttack.getAttackType() == AttackType.HIGH) 
        				{		
        					controller.armorKing.inflictDamage(controller.lili.getAttacks().get(2).getDamage());
        					armorKingHealthBar.setValue(controller.armorKing.getHP());
        					sound.setURL(controller.lili.getAttacks().get(2).getSoundFile());
        					sound.play();
        				}
        				controller.edelweissCounter = 0;
        				controller.thornWhipCounter = 0;
        				
        				if(armorKingAttack.getAttackType() != AttackType.HIGH)
        				{
        					controller.lili.inflictDamage(controller.armorKing.getAttacks().get(2).getDamage());
        					liliHealthBar.setValue(controller.lili.getHP());
        			    	sound.setURL(controller.armorKing.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_LEFT:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack armorKingAttack = controller.armorKing.getRandomAttack();
        				if (armorKingAttack.getAttackType() == AttackType.MID) 
        				{		
        					controller.armorKing.inflictDamage(controller.lili.getAttacks().get(0).getDamage());
        					armorKingHealthBar.setValue(controller.armorKing.getHP());
        					sound.setURL(controller.lili.getAttacks().get(3).getSoundFile());
        					sound.play();
        				}
        				
        				if(armorKingAttack.getAttackType() != AttackType.MID)
        				{
        					controller.lili.inflictDamage(controller.armorKing.getAttacks().get(2).getDamage());
        					liliHealthBar.setValue(controller.lili.getHP());
        			    	sound.setURL(controller.armorKing.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		case KeyEvent.VK_DOWN:
        			if(System.currentTimeMillis() - lastPressProcessed > 2100)
        			{
        				Attack armorKingAttack = controller.armorKing.getRandomAttack();
        				if (armorKingAttack.getAttackType() == AttackType.LOW) 
        				{		
        					controller.armorKing.inflictDamage(controller.lili.getAttacks().get(2).getDamage());
        					armorKingHealthBar.setValue(controller.armorKing.getHP());
        					sound.setURL(controller.lili.getAttacks().get(2).getSoundFile());
        					sound.play();
        				}
        				controller.edelweissCounter = 0;
        				controller.thornWhipCounter = 0;
        				
        				if(armorKingAttack.getAttackType() != AttackType.LOW)
        				{
        					controller.lili.inflictDamage(controller.armorKing.getAttacks().get(2).getDamage());
        					liliHealthBar.setValue(controller.lili.getHP());
        			    	sound.setURL(controller.armorKing.getAttacks().get(2).getSoundFile());
        			    	sound.play();
        				}
        				lastPressProcessed = System.currentTimeMillis();
        				break;
    				}
        		}
    		}
    	}
    	@Override 
    	public void keyReleased(KeyEvent e) 
    	{
    		
    	}
    	@Override
    	public void keyTyped(KeyEvent e) 
    	{
    		
    	}
     }

	public class TitleScreenHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event) 
    	{
    		sound.setURL(playIntroSound);
    		sound.play();
    		music.stop();
    		createMenuScreen();
    	}
    }
    
    public class ExitMenuHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		System.exit(0);
    	}
    }
    
    public class CreditScreenHandler implements ActionListener 
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		createCreditScreen();
    	}
    }
    
    public class GalleryScreenHandler1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		createGalleryScreen1();
    	}
    }
    
    public class GalleryScreenHandler2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		createGalleryScreen2();
    	}
    }
    
    public class GalleryScreenHandler3 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		createGalleryScreen3();
    	}
    } 
    
    public class GalleryScreenHandler4 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		createGalleryScreen4();
    	}
    } 
    
    public class ReturnBackHandler1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playReturnBackSound);
    		sound.play();
    		music.stop();
    		createMenuScreen();
    	}
    }
    
    public class ReturnBackHandler2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playReturnBackSound);
    		sound.play();
    		music.stop();
    		createGalleryScreen1();
    	}
    }
    
    public class ReturnBackHandler3 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playReturnBackSound);
    		sound.play();
    		music.stop();
    		createGalleryScreen2();
    	}
    }
    
    public class ReturnBackHandler4 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playReturnBackSound);
    		sound.play();
    		music.stop();
    		createGalleryScreen3();
    	}
    }
    
    public class ReturnBackHandler5 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playReturnBackSound);
    		sound.play();
    		music.stop();
    		createRulesScreen();
    	}
    }
       
    public class RulesScreenHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event) 
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		createRulesScreen();
    	}
    }
    
    public class RulesScreenHandler2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		createRulesScreen2();
    	}
    }
    
    public class HiddenStageHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playSecretStageSound);
    		sound.play();
    		music.stop();
    		createHiddenStage();
    		ses.schedule(fight_Version1, 1, TimeUnit.SECONDS);
    	}
    }
    
    public class HiddenStageHandler2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		sound.setURL(playSecretStageSound);
    		sound.play();
    		music.stop();
    		createHiddenStage2();
    		ses.schedule(fight_Version1, 1, TimeUnit.SECONDS);
    	}
    }
    
    public class JinButtonHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		if(controller.healthCounter == 0)
    		{
    			sound.setURL(playHPSound);
    			sound.play();
    			controller.jinKazama.addHP(controller.hiddenBonus);
    			jinHealthBar.setValue(controller.jinKazama.getHP());
    			controller.healthCounter++;
    		}
    		window.requestFocus();
    	}
    }
    
    public class JinButtonHandler2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		if(controller.jinAttackCounter == 0)
    		{
    			controller.triggerAttackAction(KeyEvent.VK_E, controller.jinKazama, controller.bryanFury, bryanHealthBar);
    			controller.jinAttackCounter++;
    		}
    		window.requestFocus();
    	}
    }
    
    public class DevilJinButtonHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		if(controller.meterCounter == 0)
    		{
    			playMeterSound = getClass().getResource("Meter.wav");
    			sound.setURL(playMeterSound);
				sound.play();
				controller.meter++;
				meterLabel.setText("Meter: " + controller.meter);
				controller.meterCounter++;
    		}
    		window.requestFocus();
    	}
    }
    
    public class ArcadeScreenHandler1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent event) 
    	{
    		sound.setURL(playLobbySound);
    		sound.play();
    		music.stop();
    		status1 = false;
    		status2 = true;
    		createArcadeScreen1();
    		sound.setURL(playRound1_Sound);
    		sound.play();
    		ses.schedule(fight_Version1, 1, TimeUnit.SECONDS);
    	}
    }
    
    Timer timer = new Timer(1000, new ActionListener() 
    {
    	@Override
    	public void actionPerformed(ActionEvent e) 
    	{
    		char character[] = text.toCharArray();
    		
    		int arrayNumber = character.length;
    		
    		String addedCharacter ="";
    		String blank = "";
    		
    		addedCharacter = blank + character[i];
    		textArea.append(addedCharacter);
    		
    		i++;
    		
    		if(i == arrayNumber) 
    		{
    			i = 0;
    			timer.stop();
    		}
    	}
    });
    
    Timer timer3 = new Timer(1000, new ActionListener() 
    {
    	@Override
    	public void actionPerformed(ActionEvent e) 
    	{
    		
    	}
    });
    
    public void countdownTimer() 
    {
    	Circle circle = new Circle();
    	circle.setBounds(307, 40, 80, 60);
        window.add(circle);
        
        Circle circle2 = new Circle();
        circle2.setBounds(292, 40, 80, 60);
        window.add(circle2);
        
        Circle circle3 = new Circle();
        circle3.setBounds(415, 40, 80, 60);
        window.add(circle3);
        
        Circle circle4 = new Circle();
        circle4.setBounds(430, 40, 80, 60);
        window.add(circle4);
        
    	timer3 = new Timer(1000, new ActionListener() 
    	{
    		@Override 
    		public void actionPerformed(ActionEvent e) 
    		{
    			second--;
    			counterLabel.setText("" + second);
    			
    			if(second==0) 
    			{
    				timer3.stop();
    			}
    			
    			if (!timer3.isRunning()) 
    			{
    			    if (controller.azazel.getHP() > controller.jinKazama.getHP()) 
    			    {	
    			    	if(controller.azazelWins == 0)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.azazel.restoreHP();
    			    		controller.jinKazama.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
        			    	azazelHealthBar.setValue(controller.azazel.getHP());
    			    		second = 31;
    			    		timer3.start();
    			    	}
    			    	if(controller.azazelWins == 1)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version1, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status1 = false;
    			    	}
    			    	controller.azazelWins++;    			    	
    			    } 
    			    else if (controller.jinKazama.getHP() > controller.azazel.getHP())  
    			    {
    			    	if(controller.jinWins == 0) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.jinKazama.restoreHP();
    			    		controller.azazel.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
    			    		azazelHealthBar.setValue(controller.azazel.getHP());
    			    		second = 31;
    			    		timer3.start();
    			    	}
    			    	if(controller.jinWins == 1) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version1, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status1 = false;
    			    	}
    			    	controller.jinWins++;
    			    } 
    			} 
    			else 
    			{
    			    if(controller.azazel.getHP() <= 0) 
    			    {
    			        if(controller.jinWins == 0) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.jinKazama.restoreHP();
    			    		controller.azazel.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
    			    		azazelHealthBar.setValue(controller.azazel.getHP());
    			    		second = 31;
    			    		timer3.start();
    			        }
    			        if(controller.jinWins == 1)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version1, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status1 = false;
    			        }
    			        controller.jinWins++;
    			    } 
    			    else if (controller.jinKazama.getHP() <= 0) 
    			    {
    			        if(controller.azazelWins == 0)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.azazel.restoreHP();
    			    		controller.jinKazama.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
        			    	azazelHealthBar.setValue(controller.azazel.getHP());
    			    		second = 31;
    			    		timer3.start();
    			        }
    			        if(controller.azazelWins == 1) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version1, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status1 = false;
    			        }
    			        controller.azazelWins++;
    			    }
    			}
    		}
    	});
    }
    
    ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
     
    Runnable azazelTask1 = () -> 
    {
    	controller.performRandomAttack(controller.jinKazama, controller.azazel);
		jinHealthBar.setValue(controller.jinKazama.getHP());
    };
    
    Runnable azazelTask2 = () ->
    {
    	controller.jinKazama.inflictDamage(controller.azazel.getAttacks().get(0).getDamage());
		sound.setURL(controller.azazel.getAttacks().get(0).getSoundFile());
		sound.play();
		jinHealthBar.setValue(controller.jinKazama.getHP());
    };
    
    Runnable azazelTask3 = () ->
    {
    	controller.jinKazama.inflictDamage(controller.azazel.getAttacks().get(3).getDamage());
		sound.setURL(controller.azazel.getAttacks().get(3).getSoundFile());
		sound.play();
		jinHealthBar.setValue(controller.jinKazama.getHP());
    };
    
    Runnable fight_Version1 = () ->
    {
    	playFight_Sound = getClass().getResource("Fight.wav");
    	sound.setURL(playFight_Sound);
		sound.play();
    };
    
    Runnable youWin_Version1 = () ->
    {
    	sound.setURL(playYouWin_Sound);
    	sound.play();
    };
    
    Runnable youLose_Version1 = () ->
    {
    	sound.setURL(playYouLose_Sound);
    	sound.play();
    };
    
    Runnable gameOver_Version1 = () ->
    {
    	sound.setURL(playGameOver_Sound);
    	sound.play();
    };
    
    Runnable return2MainMenu_Version1 = () ->
    {
    	timer3.stop();
    	createMenuScreen();
    	controller.azazelWins = 0;
    	controller.jinWins = 0;
    	controller.lowRoundhouseCounter = 0;
    	controller.healthCounter = 0;
    	controller.meter = 0;
    	controller.meterLimit = 0;
    	controller.jinRageLimit = 0;
    	window.setFocusable(false);
    	status1 = false;
    };
    
    Runnable attackAnimation = () ->
    {
    	attackAnimationPanel.setVisible(false);
    };
    
    public void createArcadeScreen1() 
    {
    	lobbyPanel1.setVisible(false);
    	lobbyPanel2.setVisible(false);
    	lobbyPanel3.setVisible(false);
    	lobbyPanel4.setVisible(false);
    	lobbyPanel5.setVisible(false);
    	lobbyPanel6.setVisible(false);
    	lobbyPanel7.setVisible(false);
    	
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Arcade Stage 1.gif"))));
    	
    	//Jin's health bar
    	jinHealthBarPanel = new JPanel();
    	jinHealthBarPanel.setBounds(80, 23, 250, 30);
    	jinHealthBarPanel.setBackground(Color.BLUE);
    	jinHealthBarPanel.setOpaque(false);
    	window.add(jinHealthBarPanel);
    	
    	jinHealthBar = new JProgressBar(0, 170);
    	jinHealthBar.setPreferredSize(new Dimension(250, 30));
    	jinHealthBar.setBackground(Color.RED);
    	jinHealthBar.setForeground(Color.GREEN);
    	jinHealthBar.setBorder(null);
    	jinHealthBar.setValue(controller.jinKazama.getHP());
    	jinHealthBarPanel.add(jinHealthBar);
    	
    	//Jin HP bar icon
    	jinPanel = new JPanel();
    	jinPanel.setBounds(15, 10, 60, 60);
    	jinPanel.setBackground(Color.BLUE);
    	jinPanel.setOpaque(false);
    	window.add(jinPanel);
    	
    	jinIconButton = new JButton();
    	jinIconButton.setIcon(new ImageIcon(this.getClass().getResource("Jin Icon 02.png")));
    	jinIconButton.setBorder(null);
    	jinIconButton.setBorderPainted(false);
    	jinIconButton.setContentAreaFilled(false);
    	jinIconButton.setFocusPainted(false);
    	jinIconButton.addActionListener(jinButtonHandler2);
    	jinPanel.add(jinIconButton);
    	
    	//Jin HP bar name display
    	jinNameDisplayPanel = new JPanel();
    	jinNameDisplayPanel.setBounds(65, 50, 100, 20);
    	jinNameDisplayPanel.setBackground(Color.CYAN);
    	jinNameDisplayPanel.setOpaque(false);
    	window.add(jinNameDisplayPanel);
    	
    	jinNameLabel = new JLabel("Jin Kazama");
    	jinNameLabel.setBounds(65, 50, 100, 20);
    	jinNameLabel.setForeground(Color.WHITE);
    	jinNameLabel.setFont(nameDisplayFont);
    	jinNameDisplayPanel.add(jinNameLabel);
    	
    	//Jin character (gif) display
    	jinGifPanel = new JPanel();
    	jinGifPanel.setBounds(125, 210, 135, 135);
    	jinGifPanel.setBackground(Color.BLACK);
    	jinGifPanel.setOpaque(false);
    	window.add(jinGifPanel);
    	
    	jinGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Jin Kazama 02.gif"))));
    	
    	//Bryan's health bar
    	bryanHealthBarPanel = new JPanel();
    	bryanHealthBarPanel.setBounds(425, 23, 250, 30);
    	bryanHealthBarPanel.setBackground(Color.BLUE);
    	bryanHealthBarPanel.setOpaque(false);
    	window.add(bryanHealthBarPanel);
    	
    	bryanHealthBar = new JProgressBar(0, 185);
    	bryanHealthBar.setPreferredSize(new Dimension(250, 30));
    	bryanHealthBar.setBackground(Color.RED);
    	bryanHealthBar.setForeground(Color.GREEN);
    	bryanHealthBar.setBorder(null);
    	bryanHealthBar.setValue(controller.bryanFury.getHP());
    	bryanHealthBarPanel.add(bryanHealthBar);
    	
    	//Bryan HP bar icon
    	bryanPanel = new JPanel();
    	bryanPanel.setBounds(680, 10, 60, 60);
    	bryanPanel.setBackground(Color.BLUE);
    	bryanPanel.setOpaque(false);
    	window.add(bryanPanel);
    	
    	bryanPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Bryan Icon.png")))); //Adding picture directly to JPanel
    	
    	//Bryan HP bar name display 
    	bryanNameDisplayPanel = new JPanel();
    	bryanNameDisplayPanel.setBounds(600, 50, 110, 20); 
    	bryanNameDisplayPanel.setBackground(Color.CYAN);
    	bryanNameDisplayPanel.setOpaque(false);
    	window.add(bryanNameDisplayPanel);
    	
    	bryanNameLabel = new JLabel("Bryan");
    	bryanNameLabel.setBounds(65, 50, 110, 20);
    	bryanNameLabel.setForeground(Color.WHITE);
    	bryanNameLabel.setFont(nameDisplayFont);
    	bryanNameDisplayPanel.add(bryanNameLabel);
    	
    	//Bryan character (gif) display
    	bryanGifPanel = new JPanel();
    	bryanGifPanel.setBounds(350, 210, 400, 350);
    	bryanGifPanel.setBackground(Color.BLACK);
    	bryanGifPanel.setOpaque(false);
    	window.add(bryanGifPanel);
    	
    	bryanGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Bryan Fury.gif"))));
    	
    	//Round timer (30 seconds)
    	counterLabel = new JLabel();
    	counterLabel.setBounds(300, -35, 150, 150);
    	counterLabel.setForeground(new Color(230, 230, 230)); 
    	counterLabel.setHorizontalAlignment(JLabel.CENTER);
    	counterLabel.setFont(timerFont);
    	window.add(counterLabel);
    	
    	//Arcade Battle Level 1 - Setup
    	second = 31;
    	countdownTimer2();
    	timer4.start();
    	controller.characterAttackSetup();
    	window.addKeyListener(keyHandler);
    	window.setFocusable(true);
    	window.requestFocus();
    	
    	//Safe reset
    	controller.bryanFury.restoreHP();
		controller.jinKazama.restoreHP();
		jinHealthBar.setValue(controller.jinKazama.getHP());
    	bryanHealthBar.setValue(controller.bryanFury.getHP());
    	
    	//Music
    	music.setURL(playArcadeStage1Music);							   
    	music.play();
    	music.loop();
    	
    	window.setVisible(true);
    }
    
    Timer timer4 = new Timer(1000, new ActionListener() 
    {
    	@Override
    	public void actionPerformed(ActionEvent e) 
    	{
    		
    	}
    });
    
    public void countdownTimer2() 
    {
    	Circle circle = new Circle();
    	circle.setBounds(307, 40, 80, 60);
        window.add(circle);
        
        Circle circle2 = new Circle();
        circle2.setBounds(292, 40, 80, 60);
        window.add(circle2);
        
        Circle circle3 = new Circle();
        circle3.setBounds(415, 40, 80, 60);
        window.add(circle3);
        
        Circle circle4 = new Circle();
        circle4.setBounds(430, 40, 80, 60);
        window.add(circle4);
        
    	timer4 = new Timer(1000, new ActionListener() 
    	{
    		@Override 
    		public void actionPerformed(ActionEvent e) 
    		{
    			second--;
    			counterLabel.setText("" + second);
    			
    			if(second==0) 
    			{
    				timer4.stop();
    			}
    			
    			if (!timer4.isRunning()) 
    			{
    			    if (controller.bryanFury.getHP() > controller.jinKazama.getHP()) 
    			    {	
    			    	if(controller.bryanWins == 0)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.bryanFury.restoreHP();
    			    		controller.jinKazama.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
        			    	bryanHealthBar.setValue(controller.bryanFury.getHP());
    			    		second = 31;
    			    		timer4.start();
    			    	}
    			    	if(controller.bryanWins == 1)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version2, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status2 = false;
    			    	}
    			    	controller.bryanWins++;    			    	
    			    } 
    			    else if (controller.jinKazama.getHP() > controller.bryanFury.getHP())  
    			    {
    			    	if(controller.jinWins == 0) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.jinKazama.restoreHP();
    			    		controller.bryanFury.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
    			    		bryanHealthBar.setValue(controller.bryanFury.getHP());
    			    		second = 31;
    			    		timer4.start();
    			    	}
    			    	if(controller.jinWins == 1) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(openArcadeScreen2, 2, TimeUnit.SECONDS);
    			    		status2 = false;
    			    		status3 = true;
    			    	}
    			    	controller.jinWins++;
    			    } 
    			} 
    			else 
    			{
    			    if(controller.bryanFury.getHP() <= 0) 
    			    {
    			        if(controller.jinWins == 0) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.jinKazama.restoreHP();
    			    		controller.bryanFury.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
    			    		bryanHealthBar.setValue(controller.bryanFury.getHP());
    			    		second = 31;
    			    		timer4.start();
    			        }
    			        if(controller.jinWins == 1)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(openArcadeScreen2, 2, TimeUnit.SECONDS);
    			    		status2 = false;
    			    		status3 = true;
    			        }
    			        controller.jinWins++;
    			    } 
    			    else if (controller.jinKazama.getHP() <= 0) 
    			    {
    			        if(controller.bryanWins == 0)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.bryanFury.restoreHP();
    			    		controller.jinKazama.restoreHP();
    			    		jinHealthBar.setValue(controller.jinKazama.getHP());
        			    	bryanHealthBar.setValue(controller.bryanFury.getHP());
    			    		second = 31;
    			    		timer4.start();
    			        }
    			        if(controller.bryanWins == 1) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version2, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status2 = false;
    			        }
    			        controller.bryanWins++;
    			    }
    			}
    		}
    	});
    }
    
    Runnable bryanTask1 = () ->
    {
    	controller.jinKazama.inflictDamage(controller.bryanFury.getAttacks().get(1).getDamage());
		sound.setURL(controller.bryanFury.getAttacks().get(1).getSoundFile());
		sound.play();
		jinHealthBar.setValue(controller.jinKazama.getHP());
    };
    
    Runnable bryanTask2 = () ->
    {
    	controller.performRandomAttack(controller.jinKazama, controller.bryanFury);
		jinHealthBar.setValue(controller.jinKazama.getHP());
    };
    
    Runnable bryanTask3 = () ->
    {
    	controller.jinKazama.inflictDamage(controller.bryanFury.getAttacks().get(0).getDamage());
    	sound.setURL(controller.bryanFury.getAttacks().get(0).getSoundFile());
    	sound.play();
    	jinHealthBar.setValue(controller.jinKazama.getHP());
    };
      
    Runnable return2MainMenu_Version2 = () ->
    {
    	timer4.stop();
    	createMenuScreen();
    	controller.bryanWins = 0;
    	controller.jinWins = 0;
    	controller.lowRoundhouseCounter = 0;
    	controller.jinRageLimit = 0;
    	controller.jinAttackCounter = 0;
    	window.setFocusable(false);
    	status2 = false;
    };
    
    public void createArcadeScreen2() 
    {
    	jinHealthBarPanel.setVisible(false); 
    	jinPanel.setVisible(false);
    	jinNameDisplayPanel.setVisible(false);
    	jinGifPanel.setVisible(false);
    	bryanHealthBarPanel.setVisible(false);
    	bryanPanel.setVisible(false);
    	bryanNameDisplayPanel.setVisible(false);
    	bryanGifPanel.setVisible(false);
    	attackAnimationPanel.setVisible(false);
    	
    	timer4.stop();
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Arcade Stage 2.gif"))));
    	
    	//Kazuya's health bar
    	kazuyaHealthBarPanel = new JPanel();
    	kazuyaHealthBarPanel.setBounds(80, 23, 250, 30);
    	kazuyaHealthBarPanel.setBackground(Color.BLUE);
    	kazuyaHealthBarPanel.setOpaque(false);
    	window.add(kazuyaHealthBarPanel);
    	
    	kazuyaHealthBar = new JProgressBar(0, 175);
    	kazuyaHealthBar.setPreferredSize(new Dimension(250, 30));
    	kazuyaHealthBar.setBackground(Color.RED);
    	kazuyaHealthBar.setForeground(Color.GREEN);
    	kazuyaHealthBar.setBorder(null);
    	kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
    	kazuyaHealthBarPanel.add(kazuyaHealthBar);
    	
    	//Kazuya HP bar icon
    	kazuyaPanel = new JPanel();
    	kazuyaPanel.setBounds(15, 10, 60, 60);
    	kazuyaPanel.setBackground(Color.BLUE);
    	kazuyaPanel.setOpaque(false);
    	window.add(kazuyaPanel);
    	
    	kazuyaPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Kazuya Icon.png")))); 
    	
    	//Kazuya HP bar name display
    	kazuyaNameDisplayPanel = new JPanel();
    	kazuyaNameDisplayPanel.setBounds(65, 50, 135, 20);
    	kazuyaNameDisplayPanel.setBackground(Color.CYAN);
    	kazuyaNameDisplayPanel.setOpaque(false);
    	window.add(kazuyaNameDisplayPanel);
    	
    	kazuyaNameLabel = new JLabel("Kazuya Mishima");
    	kazuyaNameLabel.setBounds(65, 50, 135, 20);
    	kazuyaNameLabel.setForeground(Color.WHITE);
    	kazuyaNameLabel.setFont(nameDisplayFont);
    	kazuyaNameDisplayPanel.add(kazuyaNameLabel);
    	
    	//Kazuya character (gif) display
    	kazuyaGifPanel = new JPanel();
    	kazuyaGifPanel.setBounds(125, 210, 135, 135);
    	kazuyaGifPanel.setBackground(Color.BLACK);
    	kazuyaGifPanel.setOpaque(false);
    	window.add(kazuyaGifPanel);
    	
    	kazuyaGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Kazuya Mishima.gif"))));
    	
    	//Heihachi's health bar
    	heihachiHealthBarPanel = new JPanel();
    	heihachiHealthBarPanel.setBounds(425, 23, 250, 30);
    	heihachiHealthBarPanel.setBackground(Color.BLUE);
    	heihachiHealthBarPanel.setOpaque(false);
    	window.add(heihachiHealthBarPanel);
    	
    	heihachiHealthBar = new JProgressBar(0, 225);
    	heihachiHealthBar.setPreferredSize(new Dimension(250, 30));
    	heihachiHealthBar.setBackground(Color.RED);
    	heihachiHealthBar.setForeground(Color.GREEN);
    	heihachiHealthBar.setBorder(null);
    	heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    	heihachiHealthBarPanel.add(heihachiHealthBar);
    	
    	//Heihachi HP bar icon
    	heihachiPanel = new JPanel();
    	heihachiPanel.setBounds(680, 10, 60, 60);
    	heihachiPanel.setBackground(Color.BLUE);
    	heihachiPanel.setOpaque(false);
    	window.add(heihachiPanel);
    	
    	heihachiPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Heihachi Icon.png")))); 
    	
    	//Heihachi HP bar name display 
    	heihachiNameDisplayPanel = new JPanel();
    	heihachiNameDisplayPanel.setBounds(550, 50, 135, 20); 
    	heihachiNameDisplayPanel.setBackground(Color.GRAY);
    	heihachiNameDisplayPanel.setOpaque(false);
    	window.add(heihachiNameDisplayPanel);
    	
    	heihachiNameLabel = new JLabel("Heihachi Mishima");
    	heihachiNameLabel.setBounds(550, 50, 135, 20);
    	heihachiNameLabel.setForeground(Color.WHITE);
    	heihachiNameLabel.setFont(nameDisplayFont);
    	heihachiNameDisplayPanel.add(heihachiNameLabel);
    	
    	//Heihachi character (gif) display
    	heihachiGifPanel = new JPanel();
    	heihachiGifPanel.setBounds(450, 205, 200, 150);
    	heihachiGifPanel.setBackground(Color.BLACK);
    	heihachiGifPanel.setOpaque(false);
    	window.add(heihachiGifPanel);
    	
    	heihachiGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Heihachi Mishima.gif"))));
    	
    	//Round timer (30 seconds)
    	counterLabel = new JLabel();
    	counterLabel.setBounds(300, -35, 150, 150);
    	counterLabel.setForeground(new Color(230, 230, 230)); 
    	counterLabel.setHorizontalAlignment(JLabel.CENTER);
    	counterLabel.setFont(timerFont);
    	window.add(counterLabel);
    	
    	//Arcade Battle Level 2 - Setup
    	second = 31;
    	countdownTimer3();
    	timer5.start();
    	controller.characterAttackSetup();
    	window.addKeyListener(keyHandler);
    	window.setFocusable(true);
    	window.requestFocus();
    	
    	//Safe reset
    	controller.kazuyaMishima.restoreHP();
		controller.heihachiMishima.restoreHP();
		kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
    	heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    	
    	//Sound
    	sound.setURL(playRound2_Sound);
    	sound.play();
    	
    	//Music
    	music.setURL(playArcadeStage2Music);							   
    	music.play();
    	music.loop();	
    	
    	ses.schedule(fight_Version1, 1, TimeUnit.SECONDS);
    	
    	window.setVisible(true);
    }
    
    Timer timer5 = new Timer(1000, new ActionListener() 
    {
    	@Override
    	public void actionPerformed(ActionEvent e) 
    	{
    		
    	}
    });
    
    public void countdownTimer3() 
    {
    	Circle circle = new Circle();
    	circle.setBounds(307, 40, 80, 60);
        window.add(circle);
        
        Circle circle2 = new Circle();
        circle2.setBounds(292, 40, 80, 60);
        window.add(circle2);
        
        Circle circle3 = new Circle();
        circle3.setBounds(415, 40, 80, 60);
        window.add(circle3);
        
        Circle circle4 = new Circle();
        circle4.setBounds(430, 40, 80, 60);
        window.add(circle4);
        
    	timer5 = new Timer(1000, new ActionListener() 
    	{
    		@Override 
    		public void actionPerformed(ActionEvent e) 
    		{
    			second--;
    			counterLabel.setText("" + second);
    			
    			if(second==0) 
    			{
    				timer5.stop();
    			}
    			
    			if (!timer5.isRunning()) 
    			{
    			    if (controller.heihachiMishima.getHP() > controller.kazuyaMishima.getHP()) 
    			    {	
    			    	if(controller.heihachiMishimaWins == 0)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.heihachiMishima.restoreHP();
    			    		controller.kazuyaMishima.restoreHP();
    			    		kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
        			    	heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    			    		second = 31;
    			    		timer5.start();
    			    	}
    			    	if(controller.heihachiMishimaWins == 1)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version3, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status3 = false;
    			    	}
    			    	controller.heihachiMishimaWins++;    			    	
    			    } 
    			    else if (controller.kazuyaMishima.getHP() > controller.heihachiMishima.getHP())  
    			    {
    			    	if(controller.kazuyaMishimaWins == 0) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.kazuyaMishima.restoreHP();
    			    		controller.heihachiMishima.restoreHP();
    			    		kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
    			    		heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    			    		second = 31;
    			    		timer5.start();
    			    	}
    			    	if(controller.kazuyaMishimaWins == 1) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(openArcadeScreen3, 2, TimeUnit.SECONDS);
    			    		status3 = false;
    			    		status4 = true;
    			    	}
    			    	controller.kazuyaMishimaWins++;
    			    } 
    			} 
    			else 
    			{
    			    if(controller.heihachiMishima.getHP() <= 0) 
    			    {
    			        if(controller.kazuyaMishimaWins == 0) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.kazuyaMishima.restoreHP();
    			    		controller.heihachiMishima.restoreHP();
    			    		kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
    			    		heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    			    		second = 31;
    			    		timer5.start();
    			        }
    			        if(controller.kazuyaMishimaWins == 1)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(openArcadeScreen3, 2, TimeUnit.SECONDS);
    			    		status3 = false;
    			    		status4 = true;
    			        }
    			        controller.kazuyaMishimaWins++;
    			    } 
    			    else if (controller.kazuyaMishima.getHP() <= 0) 
    			    {
    			        if(controller.heihachiMishimaWins == 0)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.kazuyaMishima.restoreHP();
    			    		controller.heihachiMishima.restoreHP();
    			    		kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
        			    	heihachiHealthBar.setValue(controller.heihachiMishima.getHP());
    			    		second = 31;
    			    		timer5.start();
    			        }
    			        if(controller.heihachiMishimaWins == 1) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version3, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status3 = false;
    			        }
    			        controller.heihachiMishimaWins++;
    			    }
    			}
    		}
    	});
    }
    
    Runnable openArcadeScreen2 = () ->
    {
    	createArcadeScreen2();
    };
    
    Runnable heihachiTask1 = () ->
    {
    	controller.performRandomAttack(controller.kazuyaMishima, controller.heihachiMishima);
		kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
    };
    
    Runnable heihachiTask2 = () ->
    {
    	controller.kazuyaMishima.inflictDamage(controller.heihachiMishima.getAttacks().get(2).getDamage());
    	sound.setURL(controller.heihachiMishima.getAttacks().get(2).getSoundFile());
    	sound.play();
    	kazuyaHealthBar.setValue(controller.kazuyaMishima.getHP());
    };
    
    Runnable return2MainMenu_Version3 = () ->
    {
    	timer5.stop();
    	createMenuScreen();
    	controller.heihachiMishimaWins = 0;
    	controller.kazuyaMishimaWins = 0;
    	controller.jinWins = 0;
    	controller.bryanWins = 0;
    	controller.abolishingFistCounter = 0;
    	controller.spinnningDemonCounter = 0;
    	controller.lowRoundhouseCounter = 0;
    	controller.jinAttackCounter = 0; 
    	controller.jinRageLimit = 0;
    	window.setFocusable(false);
    	status3 = false;
    };
    
    public void createArcadeScreen3()
    {
    	kazuyaHealthBarPanel.setVisible(false); 
    	kazuyaPanel.setVisible(false);
    	kazuyaNameDisplayPanel.setVisible(false);
    	kazuyaGifPanel.setVisible(false);
    	heihachiHealthBarPanel.setVisible(false);
    	heihachiPanel.setVisible(false);
    	heihachiNameDisplayPanel.setVisible(false);
    	heihachiGifPanel.setVisible(false);
    	
    	timer5.stop();
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Arcade Stage 3.gif"))));
    	
    	//Devil Jin's health bar
    	devilJinHealthBarPanel = new JPanel();
    	devilJinHealthBarPanel.setBounds(80, 23, 250, 30);
    	devilJinHealthBarPanel.setBackground(Color.BLUE);
    	devilJinHealthBarPanel.setOpaque(false);
    	window.add(devilJinHealthBarPanel);
    	
    	devilJinHealthBar = new JProgressBar(0, 200);
    	devilJinHealthBar.setPreferredSize(new Dimension(250, 30));
    	devilJinHealthBar.setBackground(Color.RED);
    	devilJinHealthBar.setForeground(Color.GREEN);
    	devilJinHealthBar.setBorder(null);
    	devilJinHealthBar.setValue(controller.devilJin.getHP());
    	devilJinHealthBarPanel.add(devilJinHealthBar);
    	
    	//Devil Jin HP bar icon
    	devilJinPanel = new JPanel();
    	devilJinPanel.setBounds(15, 10, 60, 60);
    	devilJinPanel.setBackground(Color.BLUE);
    	devilJinPanel.setOpaque(false);
    	window.add(devilJinPanel);
    	
    	devilJinIconButton = new JButton();
    	devilJinIconButton.setIcon(new ImageIcon(this.getClass().getResource("Devil Jin Icon.png")));
    	devilJinIconButton.setBorder(null);
    	devilJinIconButton.setBorderPainted(false);
    	devilJinIconButton.setContentAreaFilled(false);
    	devilJinIconButton.setFocusPainted(false);
    	devilJinIconButton.addActionListener(devilJinButtonHandler);
    	devilJinPanel.add(devilJinIconButton);
    	
    	//Devil Jin HP bar name display
    	devilJinNameDisplayPanel = new JPanel();
    	devilJinNameDisplayPanel.setBounds(55, 50, 100, 20);
    	devilJinNameDisplayPanel.setBackground(Color.CYAN);
    	devilJinNameDisplayPanel.setOpaque(false);
    	window.add(devilJinNameDisplayPanel);
    	
    	devilJinNameLabel = new JLabel("Devil Jin");
    	devilJinNameLabel.setBounds(55, 50, 100, 20);
    	devilJinNameLabel.setForeground(Color.WHITE);
    	devilJinNameLabel.setFont(nameDisplayFont);
    	devilJinNameDisplayPanel.add(devilJinNameLabel);
    	
    	//Devil Jin character (gif) display
    	devilJinGifPanel = new JPanel();
    	devilJinGifPanel.setBounds(125, 210, 135, 135);
    	devilJinGifPanel.setBackground(Color.BLACK);
    	devilJinGifPanel.setOpaque(false);
    	window.add(devilJinGifPanel);
    	
    	devilJinGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Devil Jin.gif"))));
    	
    	//Ogre's health bar
    	ogreHealthBarPanel = new JPanel();
    	ogreHealthBarPanel.setBounds(425, 23, 250, 30);
    	ogreHealthBarPanel.setBackground(Color.BLUE);
    	ogreHealthBarPanel.setOpaque(false);
    	window.add(ogreHealthBarPanel);
    	
    	ogreHealthBar = new JProgressBar(0, 400);
    	ogreHealthBar.setPreferredSize(new Dimension(250, 30));
    	ogreHealthBar.setBackground(Color.RED);
    	ogreHealthBar.setForeground(Color.GREEN);
    	ogreHealthBar.setBorder(null);
    	ogreHealthBar.setValue(controller.ogre.getHP());
    	ogreHealthBarPanel.add(ogreHealthBar);
    	
    	//Ogre HP bar icon
    	ogrePanel = new JPanel();
    	ogrePanel.setBounds(680, 10, 60, 60);
    	ogrePanel.setBackground(Color.BLUE);
    	ogrePanel.setOpaque(false);
    	window.add(ogrePanel);
    	
    	ogrePanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Ogre Icon.png")))); 
    	
    	//Ogre HP bar name display 
    	ogreNameDisplayPanel = new JPanel();
    	ogreNameDisplayPanel.setBounds(582, 50, 100, 20); 
    	ogreNameDisplayPanel.setBackground(Color.CYAN);
    	ogreNameDisplayPanel.setOpaque(false);
    	window.add(ogreNameDisplayPanel);
    	
    	ogreNameLabel = new JLabel("Ancient Ogre");
    	ogreNameLabel.setBounds(65, 50, 100, 20);
    	ogreNameLabel.setForeground(Color.WHITE);
    	ogreNameLabel.setFont(nameDisplayFont);
    	ogreNameDisplayPanel.add(ogreNameLabel);
    	
    	//Ogre character (gif) display
    	ogreGifPanel = new JPanel();
    	ogreGifPanel.setBounds(500, 185, 120, 150);
    	ogreGifPanel.setBackground(Color.BLACK);
    	ogreGifPanel.setOpaque(false);
    	window.add(ogreGifPanel);
    	
    	ogreGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Ogre.gif"))));
 
        //Meter display
        meterLabel = new JLabel("Meter: ");
        meterLabel.setBounds(15, 300, 140, 150);
        meterLabel.setForeground(Color.WHITE);
        meterLabel.setFont(meterFont);
        window.add(meterLabel);
        
    	//Round timer (30 seconds)
    	counterLabel = new JLabel();
    	counterLabel.setBounds(300, -35, 150, 150);
    	counterLabel.setForeground(new Color(230, 230, 230)); 
    	counterLabel.setHorizontalAlignment(JLabel.CENTER);
    	counterLabel.setFont(timerFont);
    	window.add(counterLabel);
    	
    	//Arcade Battle Level 3 - Setup
    	second = 31;
    	countdownTimer4();
    	timer6.start();
    	controller.characterAttackSetup();
    	window.addKeyListener(keyHandler);
    	window.setFocusable(true);
    	window.requestFocus();
    	
    	//Safe reset
    	controller.ogre.restoreHP();
		controller.devilJin.restoreHP();
		devilJinHealthBar.setValue(controller.devilJin.getHP());
		ogreHealthBar.setValue(controller.ogre.getHP());
		
		//Sound effects
    	sound.setURL(playFinalRound_Sound);
    	sound.play();
    	
    	//Music
    	music.setURL(playArcadeStage3Music);							   
    	music.play();
    	music.loop();
		
		ses.schedule(fight_Version1, 1, TimeUnit.SECONDS);
		
		window.setVisible(true);
    }
    
    Timer timer6 = new Timer(1000, new ActionListener() 
    {
    	@Override
    	public void actionPerformed(ActionEvent e) 
    	{
    		
    	}
    });
    
    public void countdownTimer4() 
    {
    	Circle circle = new Circle();
    	circle.setBounds(307, 40, 80, 60);
        window.add(circle);
        
        Circle circle2 = new Circle();
        circle2.setBounds(292, 40, 80, 60);
        window.add(circle2);
        
        Circle circle3 = new Circle();
        circle3.setBounds(415, 40, 80, 60);
        window.add(circle3);
        
        Circle circle4 = new Circle();
        circle4.setBounds(430, 40, 80, 60);
        window.add(circle4);
        
    	timer6 = new Timer(1000, new ActionListener() 
    	{
    		@Override 
    		public void actionPerformed(ActionEvent e) 
    		{
    			second--;
    			counterLabel.setText("" + second);
    			
    			if(second==0) 
    			{
    				timer6.stop();
    			}
    			
    			if (!timer6.isRunning()) 
    			{
    			    if (controller.ogre.getHP() > controller.devilJin.getHP()) 
    			    {	
    			    	if(controller.ogreWins == 0)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.ogre.restoreHP();
    			    		controller.devilJin.restoreHP();
    			    		devilJinHealthBar.setValue(controller.devilJin.getHP());
        			    	ogreHealthBar.setValue(controller.ogre.getHP());
    			    		second = 31;
    			    		timer6.start();
    			    	}
    			    	if(controller.ogreWins == 1)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version4, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status4 = false;
    			    	}
    			    	controller.ogreWins++;    			    	
    			    } 
    			    else if (controller.devilJin.getHP() > controller.ogre.getHP())  
    			    {
    			    	if(controller.devilJinWins == 0) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.devilJin.restoreHP();
    			    		controller.ogre.restoreHP();
    			    		devilJinHealthBar.setValue(controller.devilJin.getHP());
    			    		ogreHealthBar.setValue(controller.ogre.getHP());
    			    		second = 31;
    			    		timer6.start();
    			    	}
    			    	if(controller.devilJinWins == 1) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(return2MainMenu_Version4, 2, TimeUnit.SECONDS);
    			    		status4 = false;
    			    	}
    			    	controller.devilJinWins++;
    			    } 
    			} 
    			else 
    			{
    			    if(controller.ogre.getHP() <= 0) 
    			    {
    			        if(controller.devilJinWins == 0) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.devilJin.restoreHP();
    			    		controller.ogre.restoreHP();
    			    		devilJinHealthBar.setValue(controller.devilJin.getHP());
    			    		ogreHealthBar.setValue(controller.ogre.getHP());
    			    		second = 31;
    			    		timer6.start();
    			        }
    			        if(controller.devilJinWins == 1)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(return2MainMenu_Version4, 2, TimeUnit.SECONDS);
    			    		status4 = false;
    			        }
    			        controller.devilJinWins++;
    			    } 
    			    else if (controller.devilJin.getHP() <= 0) 
    			    {
    			        if(controller.ogreWins == 0)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.devilJin.restoreHP();
    			    		controller.ogre.restoreHP();
    			    		devilJinHealthBar.setValue(controller.devilJin.getHP());
        			    	ogreHealthBar.setValue(controller.ogre.getHP());
    			    		second = 31;
    			    		timer6.start();
    			        }
    			        if(controller.ogreWins == 1) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version4, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status4 = false;
    			        }
    			        controller.ogreWins++;
    			    }
    			}
    		}
    	});
    }
    
    Runnable openArcadeScreen3 = () ->
    {
    	createArcadeScreen3();
    };
    
    Runnable ogreTask1 = () ->
    {
    	controller.devilJin.inflictDamage(controller.ogre.getAttacks().get(2).getDamage());
    	sound.setURL(controller.ogre.getAttacks().get(2).getSoundFile());
    	sound.play();
    	devilJinHealthBar.setValue(controller.devilJin.getHP());
    };
    
    Runnable ogreTask2 = () ->
    {
    	controller.performRandomAttack(controller.devilJin, controller.ogre);
		devilJinHealthBar.setValue(controller.devilJin.getHP());
    };
    
    Runnable return2MainMenu_Version4 = () ->
    {
    	timer6.stop();
    	createMenuScreen();
    	controller.heihachiMishimaWins = 0;
    	controller.kazuyaMishimaWins = 0;
    	controller.jinWins = 0;
    	controller.bryanWins = 0;
    	controller.devilJinWins = 0;
    	controller.ogreWins = 0;
    	controller.wraithKickCounter = 0;
    	controller.abolishingFistCounter = 0;
    	controller.spinnningDemonCounter = 0;
    	controller.lowRoundhouseCounter = 0;
    	controller.jinAttackCounter = 0;
    	controller.jinRageLimit = 0;
    	controller.meterCounter = 0;
    	controller.meter = 0;
    	controller.meterLimit = 0;
    	controller.devilJinRageLimit = 0;
    	window.setFocusable(false);
    	status4 = false;
    };
    
    public void createHiddenStage2()
    {
    	returnPanel.setVisible(false);
    	gallerySecretStagePanel.setVisible(false);
    	window.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Hidden Stage 2.png"))));
    	
    	//Lili's health bar
    	liliHealthBarPanel = new JPanel();
    	liliHealthBarPanel.setBounds(80, 23, 250, 30);
    	liliHealthBarPanel.setBackground(Color.BLUE);
    	liliHealthBarPanel.setOpaque(false);
    	window.add(liliHealthBarPanel);
    	
    	liliHealthBar = new JProgressBar(0, 150);
    	liliHealthBar.setPreferredSize(new Dimension(250, 30));
    	liliHealthBar.setBackground(Color.RED);
    	liliHealthBar.setForeground(Color.GREEN);
    	liliHealthBar.setBorder(null);
    	liliHealthBar.setValue(controller.lili.getHP());
    	liliHealthBarPanel.add(liliHealthBar);
    	
    	//Lili HP bar icon
    	liliPanel = new JPanel();
    	liliPanel.setBounds(15, 10, 60, 60);
    	liliPanel.setBackground(Color.BLUE);
    	liliPanel.setOpaque(false);
    	window.add(liliPanel);
    	
    	liliPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Lili Icon.png")))); 
    	
    	//Lili HP bar name display
    	liliNameDisplayPanel = new JPanel();
    	liliNameDisplayPanel.setBounds(78, 50, 110, 40);
    	liliNameDisplayPanel.setBackground(Color.CYAN);
    	liliNameDisplayPanel.setOpaque(false);
    	window.add(liliNameDisplayPanel);
    	
    	liliNameLabel = new JLabel("Lili de Rochefort");
    	liliNameLabel.setBounds(78, 50, 110, 40);
    	liliNameLabel.setForeground(Color.WHITE);
    	liliNameLabel.setFont(nameDisplayFont);
    	liliNameDisplayPanel.add(liliNameLabel);
    	
    	//Lili character (gif) display
    	liliGifPanel = new JPanel();
    	liliGifPanel.setBounds(130, 195, 135, 135);
    	liliGifPanel.setBackground(Color.BLACK);
    	liliGifPanel.setOpaque(false);
    	window.add(liliGifPanel);
    	
    	liliGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Lili.gif"))));
    	
    	//Armor King's health bar
    	armorKingHealthBarPanel = new JPanel();
    	armorKingHealthBarPanel.setBounds(425, 23, 250, 30);
    	armorKingHealthBarPanel.setBackground(Color.BLUE);
    	armorKingHealthBarPanel.setOpaque(false);
    	window.add(armorKingHealthBarPanel);
    	
    	armorKingHealthBar = new JProgressBar(0, 250);
    	armorKingHealthBar.setPreferredSize(new Dimension(250, 30));
    	armorKingHealthBar.setBackground(Color.RED);
    	armorKingHealthBar.setForeground(Color.GREEN);
    	armorKingHealthBar.setBorder(null);
    	armorKingHealthBar.setValue(controller.armorKing.getHP());
    	armorKingHealthBarPanel.add(armorKingHealthBar);
    	
    	//Armor King HP bar icon
    	armorKingPanel = new JPanel();
    	armorKingPanel.setBounds(680, 10, 60, 60);
    	armorKingPanel.setBackground(Color.BLUE);
    	armorKingPanel.setOpaque(false);
    	window.add(armorKingPanel);
    	
    	armorKingPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Armor King Icon.png")))); 
    	
    	//Armor King HP bar name display 
    	armorKingNameDisplayPanel = new JPanel();
    	armorKingNameDisplayPanel.setBounds(583, 50, 110, 20); 
    	armorKingNameDisplayPanel.setBackground(Color.CYAN);
    	armorKingNameDisplayPanel.setOpaque(false);
    	window.add(armorKingNameDisplayPanel);
    	
    	armorKingNameLabel = new JLabel("Armor King");
    	armorKingNameLabel.setBounds(65, 50, 110, 20);
    	armorKingNameLabel.setForeground(Color.WHITE);
    	armorKingNameLabel.setFont(nameDisplayFont);
    	armorKingNameDisplayPanel.add(armorKingNameLabel);
    	
    	//Armor King character (gif) display
    	armorKingGifPanel = new JPanel();
    	armorKingGifPanel.setBounds(350, 215, 400, 350);
    	armorKingGifPanel.setBackground(Color.BLACK);
    	armorKingGifPanel.setOpaque(false);
    	window.add(armorKingGifPanel);
    	
    	armorKingGifPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Armor King.gif"))));
    	
    	//Round timer (30 seconds)
    	counterLabel = new JLabel();
    	counterLabel.setBounds(300, -35, 150, 150);
    	counterLabel.setForeground(new Color(230, 230, 230)); 
    	counterLabel.setHorizontalAlignment(JLabel.CENTER);
    	counterLabel.setFont(timerFont);
    	window.add(counterLabel);
    	
    	//Arcade Battle Level 1 - Setup
    	second = 31;
    	countdownTimer5();
    	timer7.start();
    	controller.characterAttackSetup();
    	window.addKeyListener(keyHandler);
    	window.setFocusable(true);
    	window.requestFocus();
    	status5 = true;
    	status1 = false;
    	status2 = false;
    	
    	//Safe reset
    	controller.armorKing.restoreHP();
		controller.lili.restoreHP();
		armorKingHealthBar.setValue(controller.armorKing.getHP());
		liliHealthBar.setValue(controller.lili.getHP());
		
    	//Hidden Stage 2 Music
    	music.setURL(playHiddenRetreat2Music);
    	music.play();
    	music.loop();	
    	
    	window.setVisible(true);
    }
    
    Timer timer7 = new Timer(1000, new ActionListener() 
    {
    	@Override
    	public void actionPerformed(ActionEvent e) 
    	{
    		
    	}
    });
    
    public void countdownTimer5() 
    {
    	Circle circle = new Circle();
    	circle.setBounds(307, 40, 80, 60);
        window.add(circle);
        
        Circle circle2 = new Circle();
        circle2.setBounds(292, 40, 80, 60);
        window.add(circle2);
        
        Circle circle3 = new Circle()
        circle3.setBounds(415, 40, 80, 60);
        window.add(circle3);
        
        Circle circle4 = new Circle();
        circle4.setBounds(430, 40, 80, 60);
        window.add(circle4);
        
    	timer7 = new Timer(1000, new ActionListener() 
    	{
    		@Override 
    		public void actionPerformed(ActionEvent e) 
    		{
    			second--;
    			counterLabel.setText("" + second);
    			
    			if(second==0) 
    			{
    				timer7.stop();
    			}
    			
    			if (!timer7.isRunning()) 
    			{
    			    if (controller.armorKing.getHP() > controller.lili.getHP()) 
    			    {	
    			    	if(controller.armorKingWins == 0)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.armorKing.restoreHP();
    			    		controller.lili.restoreHP();
    			    		liliHealthBar.setValue(controller.lili.getHP());
        			    	armorKingHealthBar.setValue(controller.armorKing.getHP());
    			    		second = 31;
    			    		timer7.start();
    			    	}
    			    	controller.liliRageLimit = 0;
    			    	
    			    	if(controller.armorKingWins == 1)
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version5, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status5 = false;
    			    	}
    			    	controller.armorKingWins++;    			    	
    			    } 
    			    else if (controller.lili.getHP() > controller.armorKing.getHP())  
    			    {
    			    	if(controller.liliWins == 0) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.lili.restoreHP();
    			    		controller.armorKing.restoreHP();
    			    		liliHealthBar.setValue(controller.lili.getHP());
    			    		armorKingHealthBar.setValue(controller.armorKing.getHP());
    			    		second = 31;
    			    		timer7.start();
    			    	}
    			    	controller.liliRageLimit = 0;
    			    	
    			    	if(controller.liliWins == 1) 
    			    	{
    			    		sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(return2MainMenu_Version5, 2, TimeUnit.SECONDS);
    			    		status5 = false;
    			    	}
    			    	controller.liliWins++;
    			    } 
    			} 
    			else 
    			{
    			    if(controller.armorKing.getHP() <= 0) 
    			    {
    			        if(controller.liliWins == 0) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle.setColor(new Color(222, 161, 47));
    			    		controller.lili.restoreHP();
    			    		controller.armorKing.restoreHP();
    			    		liliHealthBar.setValue(controller.lili.getHP());
    			    		armorKingHealthBar.setValue(controller.armorKing.getHP());
    			    		second = 31;
    			    		timer7.start();
    			        }
    			        controller.liliRageLimit = 0;
    			        if(controller.liliWins == 1)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youWin_Version1, 1, TimeUnit.SECONDS);
    			    		circle2.setColor(new Color(222, 161, 47));
    			    		music.stop();
    			    		ses.schedule(return2MainMenu_Version5, 2, TimeUnit.SECONDS);
    			    		status5 = false;
    			        }
    			        controller.liliWins++;
    			    } 
    			    else if (controller.lili.getHP() <= 0) 
    			    {
    			        if(controller.armorKingWins == 0)
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(youLose_Version1, 1, TimeUnit.SECONDS);
    			    		circle3.setColor(new Color(222, 161, 47));
    			    		controller.lili.restoreHP();
    			    		controller.armorKing.restoreHP();
    			    		liliHealthBar.setValue(controller.lili.getHP());
        			    	armorKingHealthBar.setValue(controller.armorKing.getHP());
    			    		second = 31;
    			    		timer7.start();
    			        }
    			        controller.liliRageLimit = 0;
    			        
    			        if(controller.armorKingWins == 1) 
    			        {
    			        	sound.setURL(playKO_Sound);
    			    		sound.play();
    			    		ses.schedule(gameOver_Version1, 1, TimeUnit.SECONDS);
    			    		circle4.setColor(new Color(222, 161, 47));
    			    		ses.schedule(return2MainMenu_Version5, 2, TimeUnit.SECONDS);
    			    		music.stop();
    			    		status5 = false;
    			        }
    			        controller.armorKingWins++;
    			    }
    			}
    		}
    	});
    }
    			
    Runnable return2MainMenu_Version5 = () ->
    {
    	timer7.stop();
    	createMenuScreen();
    	controller.armorKingWins = 0;
    	controller.liliWins = 0;
    	controller.edelweissCounter = 0;
    	controller.thornWhipCounter = 0;
    	controller.jinRageLimit = 0;
    	status1 = true;
    	window.setFocusable(false);
    };
    
    Runnable armorKingTask1 = () ->
    {
    	controller.performRandomAttack(controller.lili, controller.armorKing);
		liliHealthBar.setValue(controller.lili.getHP());
    };
    
    Runnable armorKingTask2 = () ->
    {
    	controller.lili.inflictDamage(controller.armorKing.getAttacks().get(2).getDamage());
    	liliHealthBar.setValue(controller.lili.getHP());
    	sound.setURL(controller.armorKing.getAttacks().get(2).getSoundFile());
    	sound.play();
    };
}
      
    
    

