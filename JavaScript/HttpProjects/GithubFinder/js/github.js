class Github {

    constructor() {
        this.client_id = '5e83eda6e7cbfdf8e399';
        this.client_secret = 'ebac6e18a0e3b719b61d9bb73cdcee76c44db37a';
    }


    async getUser(user) {
        const profileResponse = await fetch(`https://api.github.com/users/${user}?client_id=${this.client_id}&client_secret=${this.client_secret}`);
    
        const profile = await profileResponse.json();
    
        return {
          profile
        }
      }
}