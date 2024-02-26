import React, { useEffect, useState } from 'react'
import { createPuzzle, getPuzzleById, updatePuzzle } from '../../services/PuzzleService';
import { useNavigate, useParams } from 'react-router-dom';

const PuzzleComponent = () => {

  const [question, setQuestion] = useState('');
  const [answer, setAnswer] = useState('');
  const [answerString, setAnswerString] = useState('');

  const { id } = useParams();
  const [errors, setErrors] = useState({
    question: '',
    answer: '',
    answerString: ''
  });

  const navigator = useNavigate();

  useEffect(() => {
    if (id) {
      getPuzzleById(id).then((response) => {
        setQuestion(response.data.question);
        setAnswer(response.data.answer);
        setAnswerString(response.data.answerString);
      }).catch((error) => {
        console.log(error);
      })
    }
  }, [id]);

  function saveOrUpdatePuzzle(event) {
    event.preventDefault();

    if (validateForm()) {
      const puzzle = {
        question,
        answer,
        answerString
      }
      console.log(puzzle);

      if (id) {
        updatePuzzle(id, puzzle).then((response) => {
          console.log(response.data);
          navigator('/');
        }).catch(error => {
          console.log(error);
        })
      }
      else {
        createPuzzle(puzzle).then((response) => {
          console.log(response.data);
          navigator('/');
        }).catch(error => {
          console.log(error);
        })
      }
    }
  }

  function validateForm() {
    let valid = true;

    const errorsCopy = { ...errors };
    if (question.trim()) {
      errorsCopy.question = '';
    } else {
      errorsCopy.question = 'Question is required';
      valid = false;
    }
    if (answer.trim()) {
      errorsCopy.answer = '';
    } else {
      errorsCopy.answer = 'Answer is required';
      valid = false;
    }
    if (answerString.trim()) {
      errorsCopy.answerString = '';
    } else {
      errorsCopy.answerString = 'Answer String is required';
      valid = false;
    }

    setErrors(errorsCopy);

    return valid;
  }

  function pageTitle() {
    if (id) {
      return <h2 className='text-center'>Update Puzzle</h2>
    } else {
      return <h2 className='text-center'>Create Puzzle</h2>
    }
  }

  return (
    <div className='container'>
      <br />
      <div className='row'>
        <div className='card col-md-6 offset-md-3'>
          {
            pageTitle()
          }
          <div className='card-body'>
            <form>
              <div className='form-group mb-2'>
                <label htmlFor="question" className='form-label'>Question</label>
                <input
                  id="question"
                  type='text'
                  placeholder='Enter Puzzle Question'
                  name='question'
                  value={question}
                  className={'form-control' + (errors.question ? ' is-invalid' : '')}
                  onChange={(event) => setQuestion(event.target.value)} />
                {errors.question && <div className='invalid-feedback'>{errors.question}</div>}
              </div>

              <div className='form-group mb-2'>
                <label htmlFor="answer" className='form-label'>Answer</label>
                <input
                  id="answer"
                  type='text'
                  placeholder='Enter Puzzle Answer'
                  name='answer'
                  value={answer}
                  className={'form-control' + (errors.answer ? ' is-invalid' : '')}
                  onChange={(event) => setAnswer(event.target.value)} />
                {errors.answer && <div className='invalid-feedback'>{errors.answer}</div>}
              </div>

              <div className='form-group mb-2'>
                <label htmlFor="answerString" className='form-label'>Answer String</label>
                <input
                  id="answerString"
                  type='text'
                  placeholder='Enter Puzzle Answer String'
                  name='answerString'
                  value={answerString}
                  className={'form-control' + (errors.answerString ? ' is-invalid' : '')}
                  onChange={(event) => setAnswerString(event.target.value)} />
                {errors.answerString && <div className='invalid-feedback'>{errors.answerString}</div>}
              </div>

              <button className='btn btn-success' onClick={saveOrUpdatePuzzle}>Submit</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  )
}


export default PuzzleComponent