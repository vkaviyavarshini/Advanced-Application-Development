import Login from './pages/login'
import Register from './pages/register'
import Home from './pages/home'
import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Guide from './pages/guide'
import About from './pages/about'
import UserProfile from './pages/userprofile'
import BirthdayGifts from './pages/productsbycat/hbdgifts'
import AnniverseryGifts from './pages/productsbycat/annigifts'
import GiftsForHer from './pages/productsbycat/hergifts'
import GiftsForHim from './pages/productsbycat/himgifts'
import Collections from './pages/productsbycat/collections'
import WeddingGifts from './pages/productsbycat/wedding'
import OccasionGifts from './pages/productsbycat/occasiongifts'
import NeonGifts from './pages/productsbycat/neongifts'
import Range1 from './pages/productsbyprice/range1'
import Range2 from './pages/productsbyprice/range2'
import Range3 from './pages/productsbyprice/range3'
import Range4 from './pages/productsbyprice/range4'
import Range5 from './pages/productsbyprice/range5'
import Range6 from './pages/productsbyprice/range6'
import Range7 from './pages/productsbyprice/range7'
import Contact from './pages/contact'
import UserOrAdmin from './pages/useroradmin'
import AdminLogin from './pages/adminlogin'
import AdminRegister from './pages/Adminregister'
import UserTable from './pages/adminside'

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<UserOrAdmin/>}></Route>
        <Route path='/admin/login' element={<AdminLogin />}></Route>
        <Route path='/login' element={<Login />}></Route>
        <Route path='/admin/reg' element={<AdminRegister />}></Route>
        <Route path='/reg' element={<Register />}></Route>
        <Route path='/home' element={<Home />}></Route>
        <Route path='/guide' element={<Guide />}></Route>
        <Route path='/about' element={<About/>}></Route>
        <Route path='/user' element={<UserProfile/>}></Route>
        <Route path='/hbd' element={<BirthdayGifts/>}></Route>
        <Route path='/ann' element={<AnniverseryGifts/>}></Route>
        <Route path='/him' element={<GiftsForHim/>}></Route>
        <Route path='/her' element={<GiftsForHer/>}></Route>
        <Route path='/coll' element={<Collections/>}></Route>
        <Route path='/wed' element={<WeddingGifts/>}></Route>
        <Route path='/occ' element={<OccasionGifts/>}></Route>
        <Route path='/neon' element={<NeonGifts/>}></Route>
        <Route path='/b500' element={<Range1/>}></Route>
        <Route path='/b1000' element={<Range2/>}></Route>
        <Route path='/b2000' element={<Range3/>}></Route>
        <Route path='/b3000' element={<Range4/>}></Route>
        <Route path='/b4000' element={<Range5/>}></Route>
        <Route path='/b5000' element={<Range6/>}></Route>
        <Route path='/a5000' element={<Range7/>}></Route>
        <Route path='/contact' element={<Contact/>}></Route>
        <Route path='/admin/usertable' element={<UserTable/>}></Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App