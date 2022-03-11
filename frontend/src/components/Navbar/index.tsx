import {ReactComponent as GithubIcon} from 'assets/img/github.svg';

function Navbar(){

    return (
        <header>
        <nav>
          <div>
            <h1>DSMovie</h1>
            <a href="http://github.com/serginhobalski"></a>
            <div>
              <GithubIcon />
              <p>/devsuperior</p>
            </div>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;