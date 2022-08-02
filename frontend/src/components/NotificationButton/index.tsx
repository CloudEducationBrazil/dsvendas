import icon from "../../assets/img/notification-icon.svg";
import "./styles.css";

function NotificationButton() {
  // <> ... </> fragment
  return (
    <div className="dsmeta-red-btn">
      <img src={icon} alt="Notificar" />
    </div>
  );
}

export default NotificationButton;
