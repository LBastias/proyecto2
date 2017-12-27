package vista;

import controlador.Producto;
import controlador.listaProductos;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author usuario1
 */
public class VistaProductos extends javax.swing.JFrame {
   
    listaProductos Prod = new listaProductos();
  
    ArrayList<Producto> lista =new ArrayList<Producto>();
    // String columnas[]=new String[]{"Codigo","Descripcion","Precio","PrecioCompra","PrecioVenta","StockMin","StockAct"};
   
    TableRowSorter trs;
    
    public VistaProductos() {
                
         initComponents();
         pnlFiltro.setVisible(false);
         setEventoMouseClicked(tbProductos);
         DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();
         
        Producto P = new Producto();
        P.setCodigo("0001");
        P.setDescripcion("Producto 1");
        P.setPrecio(100);
        P.setPrecioCompra(80);
        P.setPrecioVenta(150);
        P.setStockMinimo(10);
        P.setStockActual(100);
       Prod.AgregarProd(P);
      
               
        Producto P1 = new Producto();    
        P1.setCodigo("0002");
        P1.setDescripcion("Producto 2");
        P1.setPrecio(210);
        P1.setPrecioCompra(150);
        P1.setPrecioVenta(250);
        P1.setStockMinimo(10);
        P1.setStockActual(100);
       Prod.AgregarProd(P1);
                      
        Producto P2 = new Producto();   
        P2.setCodigo("0003");
        P2.setDescripcion("Producto 3");
        P2.setPrecio(200);
        P2.setPrecioCompra(170);
        P2.setPrecioVenta(230);
        P2.setStockMinimo(10);
        P2.setStockActual(100);
       Prod.AgregarProd(P2);
                    
        Producto P3 = new Producto();    
        P3.setCodigo("0004");
        P3.setDescripcion("Producto 4");
        P3.setPrecio(250);
        P3.setPrecioCompra(210);
        P3.setPrecioVenta(300);
        P3.setStockMinimo(10);
        P3.setStockActual(100);
       Prod.AgregarProd(P3); 
       
                
    }
    public void limpiar(){
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        txtStockMin.setText("");
        txtStockAct.setText("");
    }
    public void cargar(){
       // DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();
    }

        private void setEventoMouseClicked(JTable tbl){
    
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
            ClickTabla(e);
            }
        });
    }
     private void ClickTabla(java.awt.event.MouseEvent evt) {
        
        int row = tbProductos.rowAtPoint(evt.getPoint());
        if (row >= 0){
        
          txtCodigo.setText(tbProductos.getValueAt(row,0).toString());
          txtDescripcion.setText(tbProductos.getValueAt(row,1).toString());
          txtPrecio.setText(tbProductos.getValueAt(row,2).toString());
          txtPrecioCompra.setText(tbProductos.getValueAt(row,3).toString());
          txtPrecioVenta.setText(tbProductos.getValueAt(row,4).toString());
          txtStockMin.setText(tbProductos.getValueAt(row,5).toString());
          txtStockAct.setText(tbProductos.getValueAt(row,6).toString());
          btnIngresar.setEnabled(false);
             
        }    
     } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStockMin = new javax.swing.JTextField();
        txtStockAct = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnFiltro = new javax.swing.JButton();
        pnlFiltro = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                open(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Stock Mínimo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Stock Actual");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        txtDescripcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseDragged(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtStockMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockMinActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Precio Compra");

        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Precio Venta");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Precio Compra", "Precio Venta", "Stock Minimo", "Stock Actual"
            }
        ));
        jScrollPane1.setViewportView(tbProductos);

        btnFiltro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFiltro.setText("Buscar por Codigo");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        pnlFiltro.setBackground(new java.awt.Color(204, 204, 255));
        pnlFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFiltroLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStockAct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(btnFiltro)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(119, 119, 119))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)))))))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnFiltro)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar))
                        .addGap(20, 20, 20)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        txtStockMin.setText("");
        txtStockAct.setText("");
        txtFiltro.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed
 
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
  
     try{   
        boolean rev=validarCliente(txtCodigo.getText(),txtDescripcion.getText());
        if (rev){
            DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();
            Producto prod=new Producto();
            
            prod.setCodigo(txtCodigo.getText());
            
            prod.setDescripcion(txtDescripcion.getText());
            prod.setPrecio(parseInt(txtPrecio.getText()));
            prod.setPrecioCompra(parseInt(txtPrecioCompra.getText()));
            prod.setPrecioVenta(parseInt(txtPrecioVenta.getText()));
            prod.setStockMinimo(parseInt(txtStockMin.getText()));
            prod.setStockActual(parseInt(txtStockAct.getText()));
            lista.add(prod);
            
            Object vector[] = new Object[7];
            vector[0]=txtCodigo.getText();
            vector[1]=txtDescripcion.getText();
            vector[2]=txtPrecio.getText();
            vector[3]=txtPrecioCompra.getText();
            vector[4]=txtPrecioVenta.getText();
            vector[5]=txtStockMin.getText();
            vector[6]=txtStockAct.getText();
            modelo.addRow(vector);
            
            JOptionPane.showMessageDialog(null, "Producto guardado en el Array");
        }
    }catch(Exception ex){
        Logger.getLogger(VistaProductos.class.getName()).log(Level.SEVERE, null, ex);  
    }
    }//GEN-LAST:event_btnIngresarActionPerformed
          private boolean validarCliente(String nombre, String descripcion){
          return !(nombre.equals("") || descripcion.equals(""));
    }
    private void txtStockMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockMinActionPerformed
       txtStockAct.requestFocus();
    }//GEN-LAST:event_txtStockMinActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              int posicion=-1;    
             
               posicion = Prod.BuscaPosProducto(txtCodigo.getText());
           if (posicion>-1 && Prod.largo()>0)
           {
              //prodretorna = LP.RegresaObje(posicion);
               Prod.AgregarProd(Prod.RegresaObje(posicion));
                agregarDatos();
                
                         
           }else{
               JOptionPane.showMessageDialog(null, "Codigo No registrado");
               
           }
     txtCodigo.setText("");
     txtCodigo.requestFocus();       
       }  
    }//GEN-LAST:event_txtCodigoKeyPressed
 
 public void limpiarTabla(JTable tbProductos){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tbProductos.getModel();
            int filas=tbProductos.getRowCount();
            for (int i = 0; filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
   private void agregarDatos(){
       
limpiarTabla(tbProductos); 
DefaultTableModel modelo = (DefaultTableModel)tbProductos.getModel();
    
String datos[] = new String[7];
String existe;
String valor = "";
int cantidadactual=0;
for (int i = 0; i < Prod.largo(); i++) {
    existe ="N";
    for(int k=0; k<modelo.getRowCount(); k++){
         if(modelo.getValueAt(k,0)==Prod.RegresaObje(i).getCodigo()){            
             valor = modelo.getValueAt(k, 3).toString();
             cantidadactual=Integer.parseInt(valor);
             cantidadactual=cantidadactual+1;
             modelo.setValueAt(cantidadactual, k, 3);
             existe="S";
         }        
    }
 if(existe.equals("N")){

 
datos[0] = Prod.RegresaObje(i).getCodigo();
datos[1] = Prod.RegresaObje(i).getDescripcion();
datos[2] = Integer.toString(Prod.RegresaObje(i).getPrecio());
datos[3] = Integer.toString(Prod.RegresaObje(i).getPrecioCompra());
datos[4] = Integer.toString(Prod.RegresaObje(i).getPrecioVenta());
datos[5] = Integer.toString(Prod.RegresaObje(i).getStockMinimo());
datos[6] = Integer.toString(Prod.RegresaObje(i).getStockActual());
modelo.addRow(datos);
tbProductos.setModel(modelo);
 }  
}  
} 
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    try{
        DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();
        int filaSelect = tbProductos.getSelectedRow();
        if(filaSelect >=0){
            Producto prod=new Producto();

            prod.setCodigo(txtCodigo.getText());                           
            prod.setDescripcion(txtDescripcion.getText());
            prod.setPrecio(parseInt(txtPrecio.getText()));
            prod.setPrecioCompra(parseInt(txtPrecioCompra.getText()));
            prod.setPrecioVenta(parseInt(txtPrecioVenta.getText()));        
            prod.setStockMinimo(parseInt(txtStockMin.getText()));
            prod.setStockActual(parseInt(txtStockAct.getText()));
            lista.add(prod);
             
            modelo.removeRow(filaSelect);
                          
                  Object vector[] = new Object[7];                                   
                   vector[0]=txtCodigo.getText();
                   vector[1]=txtDescripcion.getText();
                   vector[2]=txtPrecio.getText();
                   vector[3]=txtPrecioCompra.getText();
                   vector[4]=txtPrecioVenta.getText();
                   vector[5]=txtStockMin.getText();
                   vector[6]=txtStockAct.getText();
                   
                   modelo.addRow(vector);                 
                   btnIngresar.setEnabled(true);
                
                JOptionPane.showMessageDialog(null, "Producto guardado en el Array");
                   limpiar();
                }else{
         JOptionPane.showMessageDialog(this,"Fila NO Seleccionada");
         }
    }catch(Exception ex){
        Logger.getLogger(VistaProductos.class.getName()).log(Level.SEVERE, null, ex);  
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    try{
        DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();    
        int filaSelect = tbProductos.getSelectedRow();
     if(filaSelect >=0){
      
         modelo.removeRow(filaSelect);         
         btnIngresar.setEnabled(true);
                 }else{
         JOptionPane.showMessageDialog(this,"Fila NO Seleccionada");
     }
     }catch(Exception ex){
        Logger.getLogger(VistaProductos.class.getName()).log(Level.SEVERE, null, ex);   
     }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        txtDescripcion.requestFocus();
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
       txtPrecio.requestFocus();
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
       txtPrecioCompra.requestFocus();
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
       txtPrecioVenta.requestFocus();
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
       txtStockMin.requestFocus();
    }//GEN-LAST:event_txtPrecioVentaActionPerformed
   
    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
     DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();
     txtFiltro.addKeyListener(new KeyAdapter(){
         @Override
         public void keyReleased(KeyEvent e) {
            trs.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), 1));
         }
     });
     trs = new TableRowSorter(modelo);
     tbProductos.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        txtFiltro.requestFocus();
        pnlFiltro.setVisible(true);
             
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
     JOptionPane.showMessageDialog(null, Prod.RegresaObje(1).getDescripcion());
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void open(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_open
     DefaultTableModel modelo =(DefaultTableModel)tbProductos.getModel();
     
    }//GEN-LAST:event_open

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
      
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtDescripcionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, Prod.RegresaObje(0).getDescripcion());
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStockAct;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables
private int buscar(String codigo){
    int index=-1;
    Producto p;
    if(!lista.isEmpty()){
        Iterator<Producto>ite=lista.iterator();
        while(ite.hasNext()){
            p=ite.next();
            if(codigo==p.getCodigo()){
                index=lista.indexOf(p);
            }
        }
    }else{
        JOptionPane.showMessageDialog(null, "No encontrado");
    }
    return index;
    
}
}
