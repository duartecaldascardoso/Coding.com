import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import ListPuzzlesComponent from './components/ListPuzzlesComponent'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import PuzzleComponent from './components/PuzzleComponent'

function App() {

  return (
    <>
    <BrowserRouter>
        <HeaderComponent />
            <Routes>
              <Route path='/' element={<ListPuzzlesComponent />} />
              <Route path='/puzzle/create' element={<PuzzleComponent />} />
            </Routes>  
        <FooterComponent/>
    </BrowserRouter>
    </>
    
  )
}
export default App
