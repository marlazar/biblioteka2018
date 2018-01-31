package biblioteka;

import java.io.Serializable;

public class Autor implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ime;

	private String prezime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime == null || ime.isEmpty())
			throw new RuntimeException("Ime ne sme biti prazno");

		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			throw new RuntimeException("Prezime ne sme biti prazno");

		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
}