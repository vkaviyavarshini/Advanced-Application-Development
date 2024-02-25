import { Link } from 'react-router-dom';
import '../css/leftsidebar.css'; 

const LeftSidebar = () => {
  return (
    <div className='leftsidebar'>
        <br />
        <h2> CATEGORY </h2>
        <br/>
        <p className='ele'><Link to="/hbd">Birthday Gifts</Link></p>
        <p className='ele'><Link to="/ann">Anniversery Gifts</Link></p>
        <p className='ele'><Link to="/him">Gifts For Him</Link></p>
        <p className='ele'><Link to="/her">Gifts For Her</Link></p>
        <p className='ele'><Link to="/coll">Collections</Link></p>
        <p className='ele'><Link to="/wed">Wedding Gifts</Link></p>
        <p className='ele'><Link to="/occ">Occasion wise Gifts</Link>   </p>     
        <p className='ele'><Link to="/neon">Neon Lights</Link></p>
    </div>
  );
};

export default LeftSidebar;
  