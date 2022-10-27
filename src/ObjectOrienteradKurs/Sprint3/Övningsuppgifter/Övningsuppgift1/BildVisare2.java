package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class BildVisare2 extends JFrame implements ActionListener {

    int bildnr = 0;

    Path p = Paths.get("src/ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift1/Bilder");

    ImageIcon tempImage = new ImageIcon();
    ImageIcon unicorn = new ImageIcon("src/ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift1/Bilder/unicorn.jpg");
    ImageIcon puppy = new ImageIcon("src/ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift1/Bilder/Leroys valp.jpg");


    JLabel bildNu = new JLabel(unicorn, JLabel.CENTER);

    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JButton changePic = new JButton("Byt bild");
    JPanel panel = new JPanel();


    public BildVisare2() {

        panel.setLayout(new BorderLayout());
        changePic.addActionListener(this);
        add(panel);
        northPanel.add(bildNu);
        southPanel.add(changePic);
        //panel.add(text1, BorderLayout.NORTH);
        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(southPanel, BorderLayout.SOUTH);
        //  panel.add(unicorn, BorderLayout.EAST);

        //panel.add(changePic, BorderLayout.SOUTH);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(500, 500);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        List<String> imageFileList = loadImageNames(p);
        ImageIcon BildVisning = new ImageIcon(imageFileList.get(bildnr));
        bildNu.setIcon(BildVisning);
        bildnr++;

        if ( bildnr == 2){
            bildnr = 0;
        }

    }


    protected List<String> loadImageNames(Path imageDir) {
        List<String> imageFileNames = new ArrayList<>();
        try (DirectoryStream<Path> stream =
                     Files.newDirectoryStream(imageDir)) {
            for (Path file : stream) {
                imageFileNames.add(file.toString());
                System.out.println(file.getFileName().toString());
            }
        } catch (IOException |
                 DirectoryIteratorException x) {
            x.printStackTrace();
        }
        return imageFileNames;
    }

    public static void main(String[] args) {
        BildVisare2 bv = new BildVisare2();


    }
}
