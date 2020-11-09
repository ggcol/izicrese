package lz5.es3;

public class Persona {

	private String nome;
	private String cognome;
	private String email;

	public Persona (String nome, String cognome, String email) {
		setNome(nome);
		setCognome(cognome);
		setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		try{
			if (nome != null && nome != "") {
				this.nome = nome;
			} else {
				throw new NoNameException();
			}
		} catch (NoNameException e) {
			e.printStackTrace();
		}
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		try {
			if (nome != null && nome != "") {
				this.cognome = cognome;
			} else {
				throw new NoCognomeException();
			}
		} catch (NoCognomeException e) {
			e.printStackTrace();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		try {
			if (email != null && email != "") {
				if (checkEmail(email) == true) {
					this.email = email;
				} else {
					throw new WrongEmailException();
				}
			} else {
				throw new WrongEmailException();
			}
		} catch (WrongEmailException e) {
			e.printStackTrace();
		}

	}

	public boolean checkEmail (String rif) {
		char[] check = rif.toCharArray();
		boolean c = false;
		for (int i = 0; i < check.length; i++) {
			if (check[i]=='@')	{
				c = true;
				break;
			}
		}
		return c;
	}

}
