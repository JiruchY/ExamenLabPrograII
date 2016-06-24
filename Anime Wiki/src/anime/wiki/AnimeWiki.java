/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime.wiki;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KevinReynaldo
 */
public class AnimeWiki extends javax.swing.JFrame {
     
           
    /**
     * Creates new form AccessWiki
     */
    public AnimeWiki() {
      
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        search = new javax.swing.JTextField();
        Imagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Director = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Estudio = new javax.swing.JTextField();
        Episodios = new javax.swing.JTextField();
        Image_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        jInternalFrame2.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setText("Buscar...");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 56, 115, 30));
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 300, 280));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 2, 18)); // NOI18N
        jLabel1.setText("ANIME WIKI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre de Anime:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Tv Director: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Estudio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Episodios:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        Director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectorActionPerformed(evt);
            }
        });
        getContentPane().add(Director, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 160, -1));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, -1));
        getContentPane().add(Estudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 170, -1));

        Episodios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpisodiosActionPerformed(evt);
            }
        });
        getContentPane().add(Episodios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 170, -1));

        Image_button.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        Image_button.setText("BUSCAR");
        Image_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Image_buttonMousePressed(evt);
            }
        });
        getContentPane().add(Image_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 130, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animes-de-invierno-2016-enter.jpg"))); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void DirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirectorActionPerformed

    private void EpisodiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EpisodiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EpisodiosActionPerformed

      String buscarEpisodiosmanga(String busqueda){
    try {
            String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+busqueda+"_(manga)&prop=revisions&rvprop=content&format=json");
           
            System.out.println(result);
            result= result.replace("[","");
            result= result.replace("]","");
            result= result.replace("="," ");
            result= result.replace("\\u014d", "o");
            String search_variable = "\\n| episodes ";
            int pos = result.indexOf(search_variable);
            pos+=search_variable.length();
            while(result.charAt(pos)==' ')
                pos++;
            System.out.print(result.charAt(pos));
         
            String result_variable = "";
            for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='('&&result.charAt(i)!='<';i++)
            {
                //System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
            
            System.out.print(result_variable);
            return result_variable;
        } catch (Exception ex) {
            Logger.getLogger(AnimeWiki.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
}
      
String buscarEpisodios(String busqueda){
    try {
            String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+busqueda+"&prop=revisions&rvprop=content&format=json");
            String searchmanga=" may refer to:\n";
            if(result.indexOf(searchmanga)==-1){
                
                
            }
            System.out.println(result);
            result= result.replace("[","");
            result= result.replace("]","");
            result= result.replace("="," ");
            result= result.replace("\\u014d", "o");
            String search_variable = "\\n| episodes ";
            int pos = result.indexOf(search_variable);
            pos+=search_variable.length();
            while(result.charAt(pos)==' ')
                pos++;
            System.out.print(result.charAt(pos));
         
            String result_variable = "";
            for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='('&&result.charAt(i)!='<';i++)
            {
                //System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
            
            System.out.print(result_variable);
            return result_variable;
        } catch (Exception ex) {
            Logger.getLogger(AnimeWiki.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
}

String buscarEstudio(String busqueda){
    try {
            String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+busqueda+"&prop=revisions&rvprop=content&format=json");
            
            System.out.println(result);
            result= result.replace("[","");
            result= result.replace("]","");
            result= result.replace("="," ");
            result= result.replace("\\u014d", "o");
            String search_variable = "\\n| studio ";
            int pos = result.indexOf(search_variable);
            pos+=search_variable.length();
            while(result.charAt(pos)==' ')
                pos++;
            System.out.print(result.charAt(pos));
         
            String result_variable = "";
            for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='(';i++)
            {
                //System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
            
            System.out.print(result_variable);
            return result_variable;
        } catch (Exception ex) {
            Logger.getLogger(AnimeWiki.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
}
    
String buscarAnimeDirector(String busqueda){
    try {
            String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+busqueda+"&prop=revisions&rvprop=content&format=json");
            
            System.out.println(result);
            result= result.replace("[","");
            result= result.replace("]","");
            result= result.replace("="," ");
            result= result.replace("\\u014d", "o");
            String search_variable = "director";
            int pos = result.indexOf(search_variable);
            pos+=search_variable.length();
            while(result.charAt(pos)==' ')
                pos++;
            System.out.print(result.charAt(pos));
         
            String result_variable = "";
            for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='(';i++)
            {
                //System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
            
            System.out.print(result_variable);
            return result_variable;
        } catch (Exception ex) {
            Logger.getLogger(AnimeWiki.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
}
            
String buscarAnimeImg(String busqueda)
{
    try {
            String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles="+busqueda+"&prop=revisions&rvprop=content&format=json");
            result= result.replace("[","");
            result= result.replace("File:","");
            System.out.println(result);
            String search_variable = "image";
            int pos = result.indexOf(search_variable);
            pos+=search_variable.length();
            while(result.charAt(pos)==' ')
                pos++;
            System.out.print(result.charAt(pos));
            
            pos+=2;
            String result_variable = "";
            
            for(int i=pos;result.charAt(i)!='.';i++)
            {
                //System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
            
            
            result_variable = result_variable.replace(" ", "_");
            System.out.println(result_variable);
            
            
            String result2  = getHTML("https://en.wikipedia.org/wiki/File:"+result_variable+".jpg");
            String search_variable2 = "src=\"//upload.wikimedia.org/wikipedia/";
            String result_variable2 = "";
            for(int i=result2.indexOf(search_variable2)+search_variable2.length();result2.charAt(i)!='\"';i++)
            {
                //System.out.println(result2.charAt(i));
                result_variable2+=result2.charAt(i);
            }
            
            System.out.println("upload.wikimedia.org/wikipedia/"+result_variable2);
            return "https://upload.wikimedia.org/wikipedia/"+result_variable2;
            /**/
    } catch (Exception ex1) {
                System.out.println("Probando Version Manga...");
                buscarMangaImg(busqueda);
    }
    return null;
}

String buscarMangaImg(String busqueda)
{
    try {
            String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles="+busqueda+"_(manga)&prop=revisions&rvprop=content&format=json");
            result= result.replace("[","");
            result= result.replace("File:","");
            System.out.println(result);
            String search_variable = "image";
            int pos = result.indexOf(search_variable);
            pos+=search_variable.length();
            while(result.charAt(pos)==' ')
                pos++;
            System.out.print(result.charAt(pos));
            
            pos+=2;
            String result_variable = "";
            
            for(int i=pos;result.charAt(i)!='.';i++)
            {
                //System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
            
            result_variable = result_variable.replace(" ", "_");
            System.out.println(result_variable);
            
            
            String result2  = getHTML("https://en.wikipedia.org/wiki/File:"+result_variable+".jpg");
            String search_variable2 = "src=\"//upload.wikimedia.org/wikipedia/";
            String result_variable2 = "";
            for(int i=result2.indexOf(search_variable2)+search_variable2.length();result2.charAt(i)!='\"';i++)
            {
                //System.out.println(result2.charAt(i));
                result_variable2+=result2.charAt(i);
            }
            System.out.println("upload.wikimedia.org/wikipedia/"+result_variable2);
            return "https://upload.wikimedia.org/wikipedia/"+result_variable2;
    } catch (Exception ex1) {
                System.out.print("No se encontro");
                eraseAll();
    }
    return null;
}

    
     boolean descargarImg(String imagen) throws MalformedURLException, IOException{
        URL url = new URL(imagen);
        InputStream in = new BufferedInputStream(url.openStream());
        OutputStream out = new BufferedOutputStream(new FileOutputStream("Image.jpg"));

        for ( int i; (i = in.read()) != -1; ) {
            out.write(i);
        }
    in.close();
    out.close(); return true;
}

    
     void updateLabel(String name) {
        ImageIcon icon = new ImageIcon(name + ".jpg");
        
            Image img = icon.getImage(); 
            Image newimg = img.getScaledInstance(Imagen.getWidth(), Imagen.getHeight(),  java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimg);
            Imagen.setIcon(icon);
            Imagen.setText(null);
        
        }
    
     
    private void Image_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_buttonMousePressed
        // TODO add your handling code here:
        String busqueda = search.getText();
        Name.setText(busqueda);
        busqueda=busqueda.replace(" ","_");
        try {
            if(descargarImg(buscarAnimeImg(busqueda))){
                updateLabel("Image");
            }else{
            updateLabel("Nope");                
            }
            Director.setText(buscarAnimeDirector(busqueda));
            Estudio.setText(buscarEstudio(busqueda));
            Episodios.setText(buscarEpisodios(busqueda));
            
            
        } catch (IOException ex) {
            Logger.getLogger(AnimeWiki.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Image_buttonMousePressed
    private void eraseAll(){
            Name.setText("");
            Director.setText("");
            Estudio.setText("");
            Episodios.setText("");
            Imagen.setIcon(null);
    }
    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
    search.setText("") ;       // TODO add your handling code here:
    }//GEN-LAST:event_searchMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnimeWiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimeWiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimeWiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimeWiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimeWiki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Director;
    private javax.swing.JTextField Episodios;
    private javax.swing.JTextField Estudio;
    private javax.swing.JButton Image_button;
    private javax.swing.JLabel Imagen;
    private javax.swing.JTextField Name;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables

  
       public static String getHTML(String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
		   result.append(line);
		}
		rd.close();
		return result.toString();
	}

    }

