import logo from "../../assets/img/logoDSMETA.svg";
import "./styles.css";

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por
          <a href="https://github.com/CloudEducationBrazil/">
            @cloudeducationbrazil
          </a>
        </p>
      </div>
    </header>
  );
}

export default Header;
