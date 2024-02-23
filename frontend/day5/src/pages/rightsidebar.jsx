import { Link } from 'react-router-dom';
import '../css/rightsidebar.css'; 

const RightSidebar = () => {
  return (
    <div className='rightsidebar'>
        <br />
        <h2> PRICE RANGE </h2>
        <br/>
        <br/>
        <p className='ele'><Link to="/b500">From ₹200 To ₹500</Link></p>
        <p className='ele'><Link to="/b1000">From ₹500 To ₹1000</Link></p>
        <p className='ele'><Link to="/b2000">From ₹1000 To ₹2000</Link></p>
        <p className='ele'><Link to="/b3000">From ₹2000 To ₹3000</Link></p>
        <p className='ele'><Link to="/b4000">From ₹3000 To ₹4000</Link></p>
        <p className='ele'><Link to="/b5000">From ₹4000 To ₹5000</Link>   </p>     
        <p className='ele'><Link to="/a5000">Above ₹5000</Link></p>
    </div>
  );
};

export default RightSidebar;
