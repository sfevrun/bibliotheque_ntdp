/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque;



import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;




/**
 *
 * @author edou
 */
@Entity
@XmlRootElement
public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom; 
    private String prenom; 
    private String sexe; 
    private String photo; 
    private String email; 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDenaissance; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.unice.miage.ntdp.bibliotheque.Personne[ id=" + id + " ]";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateDenaissance() {
        return dateDenaissance;
    }

    public void setDateDenaissance(Date dateDenaissance) {
        this.dateDenaissance = dateDenaissance;
    }
   public String saveImage(String img){
      //   BufferedImage image=null;
     // image=decodeToImage(this.photo);
     try (FileOutputStream imageOutFile = new FileOutputStream("/home/saul/Desktop/VBA/"+this.id+".jpeg")) {
		 byte[] imageByte;
                BASE64Decoder decoder = new BASE64Decoder();
                imageByte = decoder.decodeBuffer(img);
			imageOutFile.write(imageByte);
		} catch (FileNotFoundException e) {
			System.out.println("Image not found" + e);
		} catch (IOException ioe) {
			System.out.println("Exception while reading the Image " + ioe);
		}
          
    
                 System.out.println("Done");
                 return "antre";
             }
   
  
    

  public static String findImage(String pathimg){
      String imageString="";
      BufferedImage image = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
               image = ImageIO.read(new File("/home/saul/Desktop/VBA/"+pathimg+".jpeg"));
                ImageIO.write(image, "", bos);
            byte[] imageBytes = bos.toByteArray();
             BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
             bos.close();
            } catch (IOException e) {
            }

                 System.out.println("Done");
                 return imageString;
             }
   
  
    public static String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
 
        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();
             BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
             bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }
    
    public static BufferedImage decodeToImage(String imageString) {
 
        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
}
/*  try {
                BufferedImage image = null;
                byte[] imageByte;
                BASE64Decoder decoder = new BASE64Decoder();
                imageByte = decoder.decodeBuffer(img);
                ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
                image = ImageIO.read(bis);
                bis.close();

                // write the image to a file
                File outputfile = new File("/home/saul/Desktop/VBA/"+this.id+".png");
                ImageIO.write(image, "png", outputfile);
  
		} catch (IOException ioe) {
			System.out.println("Exception while reading the Image " + ioe);
		}
                return "";
   }*/
