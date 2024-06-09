import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
    private JPanel menuPanel;
    private JPanel orderPanel;

    public GUI() {
        // Set the title of the window
        setTitle("Pizza Ngon S1VN");

        // Set the size of the window
        setSize(600, 600);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the background panel
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\OneDrive - VietNam National University - HCM INTERNATIONAL UNIVERSITY\\Desktop\\Project\\Online-Pizza-Ordering-System\\background.jpg");
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        backgroundPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create the "Order" button
        JButton orderButton = new JButton("Order");
        orderButton.setPreferredSize(new Dimension(200, 50));
        orderButton.setFont(new Font("Arial", Font.BOLD, 18));
        orderButton.setBackground(new Color(255, 153, 51)); // Orange color
        orderButton.setForeground(Color.WHITE); // White text color
        orderButton.setBorderPainted(false); // Remove button border
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showOrderPanel();
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);
        backgroundPanel.add(orderButton, gbc);

        // Create the "View Menu" button
        JButton viewMenuButton = new JButton("View Menu");
        viewMenuButton.setPreferredSize(new Dimension(200, 50));
        viewMenuButton.setFont(new Font("Arial", Font.BOLD, 18));
        viewMenuButton.setBackground(new Color(51, 153, 255)); // Blue color
        viewMenuButton.setForeground(Color.WHITE); // White text color
        viewMenuButton.setBorderPainted(false); // Remove button border
        viewMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMenu();
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 0;
        backgroundPanel.add(viewMenuButton, gbc);

        // Create the "Exit" button
        JButton exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(200, 50));
        exitButton.setFont(new Font("Arial", Font.BOLD, 18));
        exitButton.setBackground(new Color(255, 51, 51)); // Red color
        exitButton.setForeground(Color.WHITE); // White text color
        exitButton.setBorderPainted(false); // Remove button border
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 0;
        backgroundPanel.add(exitButton, gbc);

        // Add the background panel to the frame
        add(backgroundPanel);

        // Make the frame visible
        setVisible(true);
    }

    private void showMenu() {
        getContentPane().removeAll();

        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(11, 4));

        String[] pizzaNames = {"Peppy Paneer", "Indi Tandoori Paneer", "Farmhouse", "Margherita", "Mexican Green wave",
                "Veggie Paradise", "Chicken Paradise", "Pasta Pizza", "Chicken Sausage", "Chicken Barbeque"};
        int[] smallPrices = {215, 235, 315, 185, 215, 235, 215, 250, 275, 300};
        int[] mediumPrices = {395, 495, 335, 370, 395, 395, 415, 435, 500 , 510};
        int[] largePrices = {595, 695, 700, 535, 570, 595, 695, 595, 715, 735};

        menuPanel.add(new JLabel("Pizza Names"));
        menuPanel.add(new JLabel("Small"));
        menuPanel.add(new JLabel("Medium"));
        menuPanel.add(new JLabel("Large"));

        for (int i = 0; i < pizzaNames.length; i++) {
            menuPanel.add(new JLabel(pizzaNames[i]));
            menuPanel.add(new JLabel(String.valueOf(smallPrices[i])));
            menuPanel.add(new JLabel(String.valueOf(mediumPrices[i])));
            menuPanel.add(new JLabel(String.valueOf(largePrices[i])));
        }

        // Add the menu panel to the frame
        add(menuPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void showOrderPanel() {
        getContentPane().removeAll();
        orderPanel = new JPanel();
        orderPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Tên
        JLabel nameLabel = new JLabel("Tên:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        orderPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        orderPanel.add(nameField, gbc);

        // Số điện thoại
        JLabel phoneLabel = new JLabel("Số điện thoại:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        orderPanel.add(phoneLabel, gbc);

        JTextField phoneField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        orderPanel.add(phoneField, gbc);

        // Quận
        JLabel districtLabel = new JLabel("Quận:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        orderPanel.add(districtLabel, gbc);

        String[] districts = {"Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7", "Quận 8", "Quận 9", "Quận 10", "Quận 11", "Quận 12"};
        JComboBox<String> districtCombo = new JComboBox<>(districts);
        gbc.gridx = 1;
        gbc.gridy = 2;
        orderPanel.add(districtCombo, gbc);

        // Nút "Đặt Hàng"
        JButton orderButton = new JButton("Đặt Hàng");
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String district = (String) districtCombo.getSelectedItem();
                // Xử lý đơn hàng tại đây
                System.out.println("Tên: " + name);
                System.out.println("Số điện thoại: " + phone);
                System.out.println("Quận: " + district);
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        orderPanel.add(orderButton, gbc);

        orderPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Add the order panel to the frame
        add(orderPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}

