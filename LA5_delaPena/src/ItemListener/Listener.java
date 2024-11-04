package ItemListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener extends JFrame {
    private JPanel pMain;
    private JCheckBox cCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;
    private int ctr;

    public Listener() {
        final int[] flag = {0};
        JCheckBox[] language = {cCheckBox, cppCheckBox, cSharpCheckBox, javaCheckBox, pythonCheckBox};

        cCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                for(JCheckBox j : language) {
                    if(j.isSelected()) {
                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + j.getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + j.getText());
                        }
                    }
                }
            }
        });

        cppCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                for(JCheckBox j : language) {
                    if(j.isSelected()) {
                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + j.getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + j.getText());
                        }
                    }
                }
            }
        });

        cSharpCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                for(JCheckBox j : language) {
                    if(j.isSelected()) {
                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + j.getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + j.getText());
                        }
                    }
                }
            }
        });

        javaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                for(JCheckBox j : language) {
                    if(j.isSelected()) {
                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + j.getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + j.getText());
                        }
                    }
                }
            }
        });

        pythonCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "My Favorite Languages: ";
                ctr = 0;
                languageLabel.setText(currentText);
                for(JCheckBox j : language) {
                    if(j.isSelected()) {
                        if(ctr == 0) {
                            languageLabel.setText(languageLabel.getText() + j.getText());
                            ctr = 1;
                        }else {
                            languageLabel.setText(languageLabel.getText() + ",  " + j.getText());
                        }
                    }
                }
            }
        });

        proficiencyComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = "Proficiency: ";
                switch (proficiencyComboBox.getSelectedIndex()) {
                    case 0 -> proficiencyLabel.setText(currentText + "Low");
                    case 1 -> proficiencyLabel.setText(currentText + "Medium");
                    case 2 -> proficiencyLabel.setText(currentText + "High");
                    default -> {
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Listener s = new Listener();
        s.setContentPane(s.pMain);
        s.setSize(350, 300);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Item Listener");
    }
}
