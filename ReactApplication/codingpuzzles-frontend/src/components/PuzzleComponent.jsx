import React, { useState } from 'react'
import { createPuzzle } from '../services/PuzzleService';
import { useNavigate } from 'react-router-dom';

const PuzzleComponent = () => {

  const [question, setQuestion] = useState('');
  const [answer, setAnswer] = useState('');
  const [answerString, setAnswerString] = useState('');

  const [errors, setErrors] = useState({
    question: '',
    answer: '',
    answerString: ''
  });

  const navigator = useNavigate();

  function savePuzzle(event) {
    event.preventDefault();

    if (validateForm()) {
      const puzzle = { question, answer, answerString }
      createPuzzle(puzzle).then((response) => {
        console.log(response.data);
        navigator('/');
      }
      );
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

  return (
    <div className='container'>
      <br />
      <div className='row'>
        <div className='card col-md-6 offset-md-3'>
          <h2 className='text-center'>Create Puzzle</h2>
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

              <button className='btn btn-success' onClick={savePuzzle}>Submit</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  )
}


export default PuzzleComponent