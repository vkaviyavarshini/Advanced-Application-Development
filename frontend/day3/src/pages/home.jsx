//import React from 'react';
import Navigation from './navigationBar'; 
import LeftSidebar from './leftsidebar';
import RightSidebar from './rightsidebar';
//import { Link } from 'react-router-dom';  


const imageUrl = 'https://res.cloudinary.com/dg2jouca2/image/upload/v1708586870/homepage_caaktr.png';


const Home = () => {
  return (
    <div>
      
      <Navigation/>
      <LeftSidebar/>  
      <RightSidebar/>
      
      <div className="image-container">
        <img className='imgc' src={imageUrl} alt="Gift Shop"  />
      </div>

      <hr/>

      <footer>
        {/* Footer content goes here */}
      </footer>
    </div>
  );
};

export default Home;
