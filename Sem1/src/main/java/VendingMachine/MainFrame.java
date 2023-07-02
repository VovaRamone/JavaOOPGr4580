 package VendingMachine;

 import VendingMachine.Domen.Product;
 import VendingMachine.Services.VendingMachine;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.util.List;

 public class MainFrame extends JFrame {
     private VendingMachine vendingMachine;
     private JList<JPanel> productList;
     private JTextField cashInputField;
     private JButton buyButton;
     private JLabel balanceLabel;
     private String iconFolderPath;
     private DefaultListModel<Product> productListModel = new DefaultListModel<>();

     public MainFrame(VendingMachine vendingMachine, String iconFolderPath) {
         this.vendingMachine = vendingMachine;
         this.iconFolderPath = iconFolderPath;

         setTitle("Vending Machine");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(400, 510);
         setLayout(new BorderLayout());

         DefaultListModel<JPanel> listModel = new DefaultListModel<>();
         productList = new JList<>(listModel);
         productList.setCellRenderer(new PanelListCellRenderer()); // Set custom renderer
         add(new JScrollPane(productList), BorderLayout.CENTER);

         JPanel controlPanel = new JPanel(new FlowLayout());

         cashInputField = new JTextField(10);
         controlPanel.add(cashInputField);

         buyButton = new JButton("Buy Item");
         controlPanel.add(buyButton);

         balanceLabel = new JLabel("Balance: $" + vendingMachine.getHolder().getBalance());
         controlPanel.add(balanceLabel);

         add(controlPanel, BorderLayout.SOUTH);

         buyButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 buySelectedItem();
             }
         });
     }

     public void initialize() {
         updateProductList();
         setVisible(true);
     }

     private void updateProductList() {
         DefaultListModel<JPanel> listModel = (DefaultListModel<JPanel>) productList.getModel();
         listModel.clear();
         List<Product> productList = vendingMachine.getAssortmentList();
         for (Product product : productList) {
             JPanel panel = createProductPanel(product);
             listModel.addElement(panel);
         }
     }


     private JPanel createProductPanel(Product product) {
         JPanel panel = new JPanel();
         panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

         JLabel iconLabel = new JLabel();
         ImageIcon icon = new ImageIcon(iconFolderPath + "/" + product.getId() + ".jpg");
         icon = new ImageIcon(icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
         iconLabel.setIcon(icon);
         panel.add(iconLabel);

         JLabel priceLabel = new JLabel("$" + product.getPrice());
         priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
         panel.add(priceLabel);

         return panel;
     }

     private void buySelectedItem() {
         JPanel selectedPanel = productList.getSelectedValue();
         if (selectedPanel != null) {
             int index = productList.getSelectedIndex();
             Product selectedProduct = vendingMachine.getAssortmentList().get(index);
             int price = selectedProduct.getPrice();
             int cashInput = Integer.parseInt(cashInputField.getText());

             int balance = vendingMachine.getHolder().getBalance();
             if (cashInput >= price) {
                 int change = cashInput - price;
                 vendingMachine.buyProduct(selectedProduct, price);
                 balanceLabel.setText("Balance: $" + vendingMachine.getHolder().getBalance());
                 cashInputField.setText("");
                 updateProductList();
                 JOptionPane.showMessageDialog(MainFrame.this, "Purchase successful!\nChange: $" + change);
             } else {
                 JOptionPane.showMessageDialog(MainFrame.this, "Insufficient funds!");
             }
         }
     }

     private Product getSelectedValue() {
         int selectedIndex = productList.getSelectedIndex();
         if (selectedIndex != -1) {
             return productListModel.getElementAt(selectedIndex);
         }
         return null;
     }

     private class PanelListCellRenderer extends JPanel implements ListCellRenderer<JPanel> {
         public Component getListCellRendererComponent(JList<? extends JPanel> list, JPanel value, int index,
                                                       boolean isSelected, boolean cellHasFocus) {
             if (isSelected) {
                 setBackground(list.getSelectionBackground());
                 setForeground(list.getSelectionForeground());
             } else {
                 setBackground(list.getBackground());
                 setForeground(list.getForeground());
             }
             removeAll();
             add(value);
             return this;
         }
     }
 }
