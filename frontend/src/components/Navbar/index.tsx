import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar(){

    return (
        <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1 className="dsmovie-title">DSMovie</h1>
            <a href="http://github.com/serginhobalski"></a>
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/devsuperior /serginhobalski</p>
            </div>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;