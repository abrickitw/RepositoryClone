package hr.hrcity.eredar.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "pitanje")
public class Pitanje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_pitanje;
	
	@Column
	private long id_grad;
	
	@Column
	private long id_korisnik;
	
	@Column
	private int id_upravitelj;
	
	@Column
	private int id_status_prijave;
	
	@Column
	private int id_zaposlenika;
	
	@Column
	private int vidljivost;
	

	@Column(nullable = false)
    @NotEmpty
	private String adresa;
	
	@Column(nullable = false)
    @NotEmpty
	private String naziv_grad;
	
	@Column(nullable = false)
    @NotEmpty
	private String napomena;
	
	@Column(nullable = false)
    @NotEmpty
	private String naslov;
	
	@Column(nullable = false)
    @NotEmpty
	private String odgovor;
	
	@Column
	private LocalDateTime zaprimljena;
	
	@Column
	private LocalDateTime zavrsena;

	public long getId_pitanje() {
		return id_pitanje;
	}

	public void setId_pitanje(long id_pitanje) {
		this.id_pitanje = id_pitanje;
	}

	public long getId_grad() {
		return id_grad;
	}

	public void setId_grad(long id_grad) {
		this.id_grad = id_grad;
	}

	public long getId_korisnik() {
		return id_korisnik;
	}

	public void setId_korisnik(long id_korisnik) {
		this.id_korisnik = id_korisnik;
	}

	public int getId_upravitelj() {
		return id_upravitelj;
	}

	public void setId_upravitelj(int id_upravitelj) {
		this.id_upravitelj = id_upravitelj;
	}

	public int getId_status_prijave() {
		return id_status_prijave;
	}

	public void setId_status_prijave(int id_status_prijave) {
		this.id_status_prijave = id_status_prijave;
	}

	public int getId_zaposlenika() {
		return id_zaposlenika;
	}

	public void setId_zaposlenika(int id_zaposlenika) {
		this.id_zaposlenika = id_zaposlenika;
	}

	public int getVidljivost() {
		return vidljivost;
	}

	public void setVidljivost(int vidljivost) {
		this.vidljivost = vidljivost;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getNaziv_grad() {
		return naziv_grad;
	}

	public void setNaziv_grad(String naziv_grad) {
		this.naziv_grad = naziv_grad;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getOdgovor() {
		return odgovor;
	}

	public void setOdgovor(String odgovor) {
		this.odgovor = odgovor;
	}


	public LocalDateTime getZaprimljena() {
		return zaprimljena;
	}

	public void setZaprimljena(LocalDateTime zaprimljena) {
		this.zaprimljena = zaprimljena;
	}

	public LocalDateTime getZavrsena() {
		return zavrsena;
	}

	public void setZavrsena(LocalDateTime zavrsena) {
		this.zavrsena = zavrsena;
	}

	@Override
	public String toString() {
		return "Pitanje [id_pitanje=" + id_pitanje + ", id_grad=" + id_grad + ", id_korisnik=" + id_korisnik
				+ ", id_upravitelj=" + id_upravitelj + ", id_status_prijave=" + id_status_prijave + ", id_zaposlenika="
				+ id_zaposlenika + ", vidljivost=" + vidljivost + ", adresa=" + adresa + ", naziv_grad=" + naziv_grad
				+ ", napomena=" + napomena + ", naslov=" + naslov + ", odgovor=" + odgovor + ", zaprimljena=" + zaprimljena + ", zavrsena=" + zavrsena + "]";
	}
	
	public boolean equals(Object ob){  
        if(this==ob)          
             return true;  
        if(!(ob instanceof Pitanje))  
             return false;  
         //assume getter method in MyClass and this class has private variable myName, herName  
         return naslov.equals(((Pitanje)ob).getId_pitanje()) ;      
     } 
}


