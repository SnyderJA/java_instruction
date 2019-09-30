
public class Credit {

	
	//Variables
	private int id;
	private int movieId;
	private int actorId;
	private String role;

	
	//Constructor
		public Credit() {
		id = 0;
		movieId = 0;
		actorId = 0;
		role = "";
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getMovieId() {
			return movieId;
		}


		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}


		public int getActorId() {
			return actorId;
		}


		public void setActorId(int actorId) {
			this.actorId = actorId;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		@Override
		public String toString() {
			return "credit [id=" + id + ", movieId=" + movieId + ", actorId=" + actorId + ", role=" + role + "]";
		}
		
	}
